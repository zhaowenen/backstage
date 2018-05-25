package com.baojia.backstage.depositservice.modules.deposit.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.depositsdk.service.models.DepositApply;
import com.baojia.backstage.depositsdk.service.service.DepositApplyService;
import com.baojia.backstage.depositservice.modules.deposit.dao.DepositApplyMapper;
import com.baojia.backstage.domain.deposit.bo.DepositApplyBo;
import com.baojia.backstage.domain.deposit.dto.DepositApplyDto;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author renjing
 * @Title: DepositApplyServiceImpl
 * @description 押金扣款/提现申请实现类
 * @date 2018/5/23 14:06
 */
@Component
@Service(interfaceClass = DepositApplyService.class)
public class DepositApplyServiceImpl  extends ServiceImpl<DepositApplyMapper, DepositApply> implements DepositApplyService{

	@Override
	public PageUtils getWithDrawHistory(DepositApplyDto depositApplyDto) {
		PageHelper.startPage(depositApplyDto.getPageNum(),depositApplyDto.getPageSize());
		List<DepositApplyBo> depositApplyList = baseMapper.selectWithDrawHistory(depositApplyDto);
		PageInfo<DepositApplyBo> pageInfo = new PageInfo<>(depositApplyList);
		PageUtils page = new PageUtils(pageInfo.getList(), (int)pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getPageNum());
        return page;
	}

}
