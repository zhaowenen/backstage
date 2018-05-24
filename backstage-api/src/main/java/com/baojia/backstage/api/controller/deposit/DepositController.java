package com.baojia.backstage.api.controller.deposit;


import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baojia.backstage.api.controller.sys.AbstractController;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.common.auth.util.Result;
import com.baojia.backstage.common.exception.MeBikeException;
import com.baojia.backstage.depositsdk.service.service.DepositApplyService;
import com.baojia.backstage.depositsdk.service.service.DepositOrderService;
import com.baojia.backstage.domain.deposit.bo.DepositOrderInfoBo;
import com.baojia.backstage.domain.deposit.dto.DepositApplyDto;
import com.baojia.backstage.domain.deposit.dto.DepositOrderDto;

import enums.BaseResult;
import enums.deposit.DepositConditionType;
import enums.deposit.DepositPayMethodStatus;
import enums.deposit.DepositStatus;
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

	
	@GetMapping(value = "/orderlist", produces = { "application/json;charset=UTF-8" })
	@ApiOperation(value="押金订单查询列表", notes="根据查询条件查询押金订单列表")
//	@ApiImplicitParam(name = "DepositOrderDto", value = "订单复杂对象实体DepositOrderDto", required = false, dataType = "DepositOrderDto")
	// @RequiresPermissions("deposits:orderlist")
	public Result getDepositOrderList(DepositOrderDto depositOrderDto) {
		try {
			if (depositOrderDto.getPayMethod() != DepositPayMethodStatus.ALIPAY.getType() || 
					depositOrderDto.getPayMethod() != DepositPayMethodStatus.WECHAT.getType()) {
				throw new MeBikeException(Result.ERROR_PARAM);
			}
			if (depositOrderDto.getStatus() != DepositStatus.PAID.getType() || 
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
			DepositOrderInfoBo withDrawInfo = depositOrderService.getDepositOrderWithDrawInfo(depositOrderId);
			if(withDrawInfo != null) {
				orderInfo.setOpsUser(withDrawInfo.getOpsUser());
				orderInfo.setDeductAmount(withDrawInfo.getDeductAmount());
				orderInfo.setDeductMoneyTime(orderInfo.getRefundTime());	//扣款与提现同时发生，所以扣款时间就是提现时间。因为数据库只有扣款申请，而押金订单表中会更新提现时间
				orderInfo.setDeductMoneyMemo(withDrawInfo.getDeductMoneyMemo());
			}
			
			Result res = Result.SUCCESS.copyThis();
			res.setContext(orderInfo);
			return res;
		} catch (Exception e) {
			return Result.error(e.getMessage());
		}
	}
	
	@GetMapping(value = "/withDrawHistory", produces = { "application/json;charset=UTF-8" })
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
}
