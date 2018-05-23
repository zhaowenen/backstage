package com.baojia.backstage.api.controller.deposit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baojia.backstage.api.controller.sys.AbstractController;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.common.auth.util.R;
import com.baojia.backstage.depositsdk.service.service.DepositApplyService;
import com.baojia.backstage.domain.deposit.dto.DepositApplyDto;

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

	@RequestMapping(value = "/list", produces = { "application/json;charset=UTF-8" })
//	@RequiresPermissions("deposits:list")
	public R getDepositApplyById(DepositApplyDto depositApplyDto) {
		PageUtils page = depositApplyService.complexDepositApplyPage(depositApplyDto.getPageNum(),
				depositApplyDto.getPageSize());
		return R.ok().put("apply", page);
	}
}
