package com.baojia.backstage.api.controller.deposit;

import java.net.URLDecoder;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping(value = "/applylist", produces = { "application/json;charset=UTF-8" })
	// @RequiresPermissions("deposits:list")
	public R getDepositApplyById(DepositApplyDto depositApplyDto) {
		PageUtils page = depositApplyService.complexDepositApplyPage(depositApplyDto.getPageNum(),
				depositApplyDto.getPageSize());
		return R.ok().put("apply", page);
	}

	@RequestMapping(value = "/orderlist", produces = { "application/json;charset=UTF-8" })
	// @RequiresPermissions("deposits:orderlist")
	public Result getDepositOrderList(@RequestParam("pageNum") Integer pageNum,
			@RequestParam("pageSize") Integer pageSize,
			@RequestParam(value = "payMethod", required = false) Integer payMethod,
			@RequestParam(value = "status", required = false) Integer status,
			@RequestParam(value = "mobile", required = false) String mobile,
			@RequestParam(value = "startTime", required = false) String startTime,
			@RequestParam(value = "endTime", required = false) String endTime) {
		try {
			if (pageNum == null || pageSize == null) {
				throw new MiBikeException(Result.ERROR_PARAM);
			}
			Date start = null;
			Date end = null;
			if (StringUtils.isNotBlank(startTime)) {
				start = DateUtils.parse(URLDecoder.decode(startTime));
			}
			if (StringUtils.isNotBlank(endTime)) {
				end = DateUtils.parse(URLDecoder.decode(endTime));
			}
			DepositOrderDto depositOrderDto = new DepositOrderDto();
			depositOrderDto.setMobile(mobile);
			depositOrderDto.setPageNum(pageNum);
			depositOrderDto.setPageSize(pageSize);
			depositOrderDto.setPayMethod(payMethod);
			depositOrderDto.setStatus(status);
			depositOrderDto.setStartTime(start);
			depositOrderDto.setEndTime(end);

			PageUtils list = depositOrderService.selectDepositOrderList(depositOrderDto);
			
			Result res = Result.SUCCESS.copyThis();
			res.setContext(list);
			return res;
		} catch (Exception e) {
			return Result.error(e.getMessage());
		}
	}
}
