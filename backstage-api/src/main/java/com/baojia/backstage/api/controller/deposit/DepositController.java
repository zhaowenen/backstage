package com.baojia.backstage.api.controller.deposit;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baojia.backstage.api.controller.sys.AbstractController;
import com.baojia.backstage.common.auth.util.DateUtils;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.common.auth.util.Result;
import com.baojia.backstage.common.exception.MeBikeException;
import com.baojia.backstage.depositsdk.service.service.BusinessService;
import com.baojia.backstage.depositsdk.service.service.DepositApplyService;
import com.baojia.backstage.depositsdk.service.service.DepositOrderService;
import com.baojia.backstage.depositsdk.service.service.RefundRecordService;
import com.baojia.backstage.domain.deposit.bo.DepositOrderInfoBo;
import com.baojia.backstage.domain.deposit.dto.DepositApplyDto;
import com.baojia.backstage.domain.deposit.dto.DepositOrderDto;

import enums.BaseResult;
import enums.deposit.DepositApplyType;
import enums.deposit.DepositPayMethodStatus;
import enums.deposit.DepositStatus;
import enums.deposit.UserModeType;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @Title: DepositController
 * @Description: 押金操作信息
 * @author renjing
 * @date 2018年5月23日 上午9:40:10
 */
@RestController
@RequestMapping("/deposits")
public class DepositController extends AbstractController {

	@Reference
	private DepositApplyService depositApplyService;
	@Reference
	private DepositOrderService depositOrderService;
	@Reference 
	private RefundRecordService refundRecordService;
	@Reference
	private BusinessService businessService;

	
	@GetMapping(value = "/orderlist", produces = { "application/json;charset=UTF-8" })
	@ApiOperation(value="押金订单查询列表", notes="根据查询条件查询押金订单列表")
//	@ApiImplicitParam(name = "DepositOrderDto", value = "订单复杂对象实体DepositOrderDto", required = false, dataType = "DepositOrderDto")
	// @RequiresPermissions("deposits:orderlist")
	public Result getDepositOrderList(DepositOrderDto depositOrderDto) {
		try {
			if (depositOrderDto.getPayMethod() == null || depositOrderDto.getStatus() == null) {
				throw new MeBikeException(Result.ERROR_PARAM);
			}
			if (depositOrderDto.getPayMethod() != DepositPayMethodStatus.ALIPAY.getType() && 
					depositOrderDto.getPayMethod() != DepositPayMethodStatus.WECHAT.getType()) {
				throw new MeBikeException(Result.ERROR_PARAM);
			}
			if (depositOrderDto.getStatus() != DepositStatus.PAID.getType() && 
					depositOrderDto.getStatus() != DepositStatus.WITHDRAW.getType()) {
				throw new MeBikeException(Result.ERROR_PARAM);
			}
			PageUtils list = depositOrderService.selectDepositOrderList(depositOrderDto);
			
			Result res = Result.SUCCESS.copyThis();
			res.setContext(list);
			return res;
		} catch (Exception e) {
			return Result.error(e.getMessage());
		}
	}
	
	
	@GetMapping(value = "/depositOrderInfo", produces = { "application/json;charset=UTF-8" })
	@ApiOperation(value="押金订单查询详情", notes="查询押金订单详情")
	// @RequiresPermissions("deposits:orderlist")
	public Result getDepositOrderInfo(@ApiParam(name="depositOrderId",value="押金ID",required=true) @RequestParam("depositOrderId") Long  depositOrderId) {
		try {
			if(depositOrderId == null) {
				throw new MeBikeException(Result.ERROR_PARAM);
			}
			DepositOrderInfoBo orderInfo = depositOrderService.getDepositOrderInfo(depositOrderId);
			DepositOrderInfoBo withDrawInfo = depositOrderService.getDepositOrderWithDrawInfo(depositOrderId);//获取退款详情
			if(withDrawInfo != null) {
				orderInfo.setOpsUser(withDrawInfo.getOpsUser());
				orderInfo.setDeductAmount(withDrawInfo.getDeductAmount());
				orderInfo.setDeductMoneyTime(orderInfo.getRefundTime());	//扣款与提现同时发生，所以这个扣款时间就是提现时间。因为数据库只有扣款申请，没有记录扣款时间，而押金订单表中会更新提现时间
				orderInfo.setDeductMoneyMemo(withDrawInfo.getDeductMoneyMemo());
			}
			
			Result res = Result.SUCCESS.copyThis();
			res.setContext(orderInfo);
			return res;
		} catch (Exception e) {
			return Result.error(e.getMessage());
		}
	}
	
	
	@GetMapping(value = "/getWithDrawHistory", produces = { "application/json;charset=UTF-8" })
	@ApiOperation(value="押金扣款记录查询列表", notes="根据查询条件查询押金扣款记录列表")
	@ApiImplicitParam(name = "DepositApplyDto", value = "押金扣款记录复杂对象实体DepositApplyDto", required = false, dataType = "DepositApplyDto")
	// @RequiresPermissions("deposits:orderlist")
	public Result getWithDrawHistory(DepositApplyDto depositApplyDto) {
		try {
			if (StringUtils.isAnyBlank(depositApplyDto.getConditionType(), depositApplyDto.getKeyWords())) {
				throw new MeBikeException(Result.ERROR_PARAM);
			}
			PageUtils list = depositApplyService.getWithDrawHistory(depositApplyDto);
			
			Result res = Result.SUCCESS.copyThis();
			res.setContext(list);
			return res;
		} catch (Exception e) {
			return Result.error(e.getMessage());
		}
	}
	
	
	@PutMapping(value = "/withdrawDeposit", produces = { "application/json;charset=UTF-8" })
	@ApiOperation(value="押金提现", notes="押金提现")
	// @RequiresPermissions("deposits:orderlist")
	public Result withdrawDeposit(@ApiParam(name="depositOrderId",value="押金ID",required=true) @RequestParam("depositOrderId") Long  depositOrderId) {
		try {
			if (depositOrderId == null) {
				throw new MeBikeException(Result.ERROR_PARAM);
			}
//			Map<String, Object> map = depositOrderService.selectMap(new EntityWrapper<DepositOrder>().eq("deposit_order_id", depositOrderId));
			Map<String, Object> map = depositOrderService.getDepositOrderById(depositOrderId);
			if(map == null) {
				throw new MeBikeException(BaseResult.NOT_FOUNT);
			}
			map.forEach((key, value) -> logger.info("DepositOrderById: " + key + "--->" + value));
			
			Long userId = MapUtils.getLong(map, "userId");
			String userName = MapUtils.getString(map, "userName");
			String userPhone = MapUtils.getString(map, "mobile");
			BigDecimal applyAmount = new BigDecimal(MapUtils.getDoubleValue(map, "amount"));
			Long applyUserId = 12L;	//当前登陆人Id
			String applyUserName = "admin";	//当前登陆人
			Integer payMethod = MapUtils.getInteger(map, "payMethod");	//用户收款方式，因为后台提现操作在押金订单表中的退款方式都是后台原路提现，所以要根据押金订单表中的支付方式来设置这个用户收款方式
			Integer depositFrom = MapUtils.getInteger(map, "depositFrom");	
			String payTimeStemp = MapUtils.getString(map, "payTime");
			Date payTime = DateUtils.parse(payTimeStemp);
			Integer userMode = null;
			if(payMethod == DepositPayMethodStatus.WECHAT.getType()) {
				userMode = UserModeType.WECHAT.getType();
			}
			if(payMethod == DepositPayMethodStatus.ALIPAY.getType()) {
				userMode = UserModeType.ALIPAY.getType();
			}
			String userAccount = null;	//暂定，支付押金时是微信或支付宝支付，没有账号；银行支付，不知道从哪获取
			//1.添加提现申请表和退款流水表
			Map<String, Object> idMap = businessService.addWithDrawInfo(DepositApplyType.WITHDRAW.getType(), userId, userName, userPhone, applyAmount, new BigDecimal(0), applyUserId, applyUserName, userMode, userName, userAccount, depositOrderId);
			Long withDrawApplyId = MapUtils.getLong(idMap, "withDrawApplyId");
			Long refundRecordId = MapUtils.getLong(idMap, "refundRecordId");
			String orderNo = MapUtils.getString(idMap, "orderNo");	//退款流水表的订单号
			if(withDrawApplyId == null || refundRecordId == null) {
				throw new MeBikeException(BaseResult.INSERT_ERROR);
			}
			idMap.forEach((key, value) -> logger.info("idMap: " + key + "--->" + value));
			
			//3.调接口提现
			String status = "success";	//接口返回状态
			String outTradeNo = null;	//接口返回的商户号
			//4.更新押金相关表状态
			businessService.updateDepositStauts(withDrawApplyId, refundRecordId, depositOrderId, status, applyUserName, applyAmount, new BigDecimal(0), payTime, applyUserId, depositFrom, orderNo, outTradeNo);
			
			Result res = Result.SUCCESS.copyThis();
			res.setContext(map);
			return res;
		} catch (Exception e) {
			return Result.error(e.getMessage());
		}
	}
}
