package com.baojia.backstage.depositsdk.service.service;


import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.depositsdk.service.models.DepositOrder;
import com.baojia.backstage.domain.deposit.bo.DepositOrderInfoBo;
import com.baojia.backstage.domain.deposit.dto.DepositOrderDto;
import com.baomidou.mybatisplus.service.IService;

public interface DepositOrderService extends IService<DepositOrder>{

	PageUtils selectDepositOrderList(DepositOrderDto depositOrderDto);
	
	DepositOrderInfoBo getDepositOrderInfo(Long depositOrderId);
	
	DepositOrderInfoBo getDepositOrderWithDrawInfo(Long depositOrderId);
	
}
