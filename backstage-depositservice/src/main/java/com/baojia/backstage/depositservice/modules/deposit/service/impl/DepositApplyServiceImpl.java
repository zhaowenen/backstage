package com.baojia.backstage.depositservice.modules.deposit.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.depositsdk.service.models.DepositApply;
import com.baojia.backstage.depositsdk.service.service.DepositApplyService;
import com.baojia.backstage.depositservice.modules.deposit.dao.DepositApplyMapper;
import com.baojia.backstage.domain.deposit.bo.DepositApplyBo;
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
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
    public PageUtils complexDepositApplyPage(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<DepositApplyBo> list = baseMapper.getDepositApplyPage();
        PageInfo<DepositApplyBo> pageInfo = new PageInfo<DepositApplyBo>(list);
        PageUtils page = new PageUtils(pageInfo.getList(), (int)pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getPageNum());
        return page;
    }
}
