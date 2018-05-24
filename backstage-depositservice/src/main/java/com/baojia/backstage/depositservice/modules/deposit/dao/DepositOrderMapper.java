package com.baojia.backstage.depositservice.modules.deposit.dao;

import java.util.List;

import com.baojia.backstage.depositsdk.service.models.DepositOrder;
import com.baojia.backstage.domain.deposit.bo.DepositOrderBo;
import com.baojia.backstage.domain.deposit.dto.DepositOrderDto;
import com.baomidou.mybatisplus.mapper.BaseMapper;

public interface DepositOrderMapper extends BaseMapper<DepositOrder>{
	
	public List<DepositOrderBo> selectDepositOrderList(DepositOrderDto depositOrderDto);
}