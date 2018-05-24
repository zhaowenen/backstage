package com.baojia.backstage.depositservice.modules.deposit.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.depositsdk.service.models.DepositApply;
import com.baojia.backstage.depositsdk.service.service.DepositApplyService;
import com.baojia.backstage.depositservice.modules.deposit.dao.DepositApplyMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * @author renjing
 * @Title: DepositApplyServiceImpl
 * @description 押金扣款/提现申请实现类
 * @date 2018/5/23 14:06
 */
@Component
@Service(interfaceClass = DepositApplyService.class)
public class DepositApplyServiceImpl  extends ServiceImpl<DepositApplyMapper, DepositApply> implements DepositApplyService{

}
