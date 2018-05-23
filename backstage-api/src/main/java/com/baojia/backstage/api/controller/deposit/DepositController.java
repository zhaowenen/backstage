package com.baojia.backstage.api.controller.deposit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baojia.backstage.api.controller.sys.AbstractController;
import com.baojia.backstage.common.auth.util.R;

/**
 * @author renjing
 * @Title: DepositController
 * @Description: 押金操作信息
 * @date 2018/5/23 08:59
 */
@RestController
@RequestMapping("/deposits")
public class DepositController extends AbstractController {
	public R getDeposits() {
		return R.ok();
	}
}
