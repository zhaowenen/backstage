package com.baojia.backstage.depositservice.modules.deposit.dao;

import java.util.List;

import com.baojia.backstage.depositsdk.service.models.DepositApply;
import com.baojia.backstage.domain.deposit.bo.DepositApplyBo;
import com.baojia.backstage.domain.deposit.dto.DepositApplyDto;
import com.baomidou.mybatisplus.mapper.BaseMapper;

public interface DepositApplyMapper extends BaseMapper<DepositApply>{
	
	List<DepositApplyBo> selectWithDrawHistory(DepositApplyDto depositApplyDto);
	
	int insertSelective(DepositApply depositApply);
	
	void updateByPrimaryKeySelective(DepositApply depositApply);
}