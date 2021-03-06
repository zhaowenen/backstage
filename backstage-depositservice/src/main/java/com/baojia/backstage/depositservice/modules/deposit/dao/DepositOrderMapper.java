package com.baojia.backstage.depositservice.modules.deposit.dao;

import java.util.List;
import java.util.Map;

import com.baojia.backstage.depositsdk.service.models.DepositOrder;
import com.baojia.backstage.domain.deposit.bo.DepositOrderBo;
import com.baojia.backstage.domain.deposit.bo.DepositOrderInfoBo;
import com.baojia.backstage.domain.deposit.dto.DepositOrderDto;
import com.baomidou.mybatisplus.mapper.BaseMapper;

public interface DepositOrderMapper extends BaseMapper<DepositOrder>{
	
	List<DepositOrderBo> selectDepositOrderList(DepositOrderDto depositOrderDto);
	
	DepositOrderInfoBo selectDepositOrderInfo(Long depositOrderId);
	
	Map<String, Object> selectDepositOrderById(Long depositOrderId);
	
	DepositOrderInfoBo selectDepositOrderWithDrawInfo(Long depositOrderId);
	
	void updateByPrimaryKeySelective(DepositOrder depositOrder);
}