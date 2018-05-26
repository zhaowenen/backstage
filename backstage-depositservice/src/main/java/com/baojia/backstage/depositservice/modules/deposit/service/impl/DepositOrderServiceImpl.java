package com.baojia.backstage.depositservice.modules.deposit.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.depositsdk.service.models.DepositOrder;
import com.baojia.backstage.depositsdk.service.service.DepositOrderService;
import com.baojia.backstage.depositservice.modules.deposit.dao.DepositOrderMapper;
import com.baojia.backstage.domain.deposit.bo.DepositOrderBo;
import com.baojia.backstage.domain.deposit.bo.DepositOrderInfoBo;
import com.baojia.backstage.domain.deposit.dto.DepositOrderDto;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author renjing
 * @Title: DepositOrderServiceImpl
 * @description 押金订单实现类
 * @date 2018/5/24 10:53
 */
@Component
@Service(interfaceClass = DepositOrderService.class)
public class DepositOrderServiceImpl  extends ServiceImpl<DepositOrderMapper, DepositOrder> implements DepositOrderService{
	
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public PageUtils selectDepositOrderList(DepositOrderDto depositOrderDto) {
		PageHelper.startPage(depositOrderDto.getPageNum(),depositOrderDto.getPageSize());
		List<DepositOrderBo> depositOrderList = baseMapper.selectDepositOrderList(depositOrderDto);
		PageInfo<DepositOrderBo> pageInfo = new PageInfo<>(depositOrderList);
		PageUtils page = new PageUtils(pageInfo.getList(), (int)pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getPageNum());
        return page;
	}

	@Override
	public DepositOrderInfoBo getDepositOrderInfo(Long depositOrderId) {
		return baseMapper.selectDepositOrderInfo(depositOrderId);
	}

	@Override
	public DepositOrderInfoBo getDepositOrderWithDrawInfo(Long depositOrderId) {
		return baseMapper.selectDepositOrderWithDrawInfo(depositOrderId);
	}

	@Override
	public Map<String, Object> getDepositOrderById(Long depositOrderId) {
		return baseMapper.selectDepositOrderById(depositOrderId);
	}
}
