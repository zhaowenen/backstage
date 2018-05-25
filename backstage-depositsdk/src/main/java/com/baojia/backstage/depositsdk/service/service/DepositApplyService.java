package com.baojia.backstage.depositsdk.service.service;


import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.depositsdk.service.models.DepositApply;
import com.baojia.backstage.domain.deposit.dto.DepositApplyDto;
import com.baomidou.mybatisplus.service.IService;

public interface DepositApplyService extends IService<DepositApply>{

	PageUtils getWithDrawHistory(DepositApplyDto depositApplyDto);
}
