package com.baojia.backstage.api.controller.deposit;

import java.net.URLDecoder;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baojia.backstage.api.controller.sys.AbstractController;
import com.baojia.backstage.common.auth.util.DateUtils;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.common.auth.util.R;
import com.baojia.backstage.common.auth.util.Result;
import com.baojia.backstage.common.exception.MiBikeException;
import com.baojia.backstage.depositsdk.service.service.DepositApplyService;
import com.baojia.backstage.depositsdk.service.service.DepositOrderService;
import com.baojia.backstage.domain.deposit.dto.DepositApplyDto;
import com.baojia.backstage.domain.deposit.dto.DepositOrderDto;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

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
			if (depositOrderDto.getPageNum() == null || depositOrderDto.getPageSize() == null) {
				throw new MiBikeException(Result.ERROR_PARAM);
			}
			PageUtils list = depositOrderService.selectDepositOrderList(depositOrderDto);
			
			Result res = Result.SUCCESS.copyThis();
			res.setContext(list);
			return res;
		} catch (Exception e) {
			return Result.error(e.getMessage());
		}
	}
}
