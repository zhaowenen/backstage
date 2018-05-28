package com.baojia.backstage.depositservice.modules.deposit.service.impl;


import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.depositsdk.service.models.RefundRecord;
import com.baojia.backstage.depositsdk.service.service.RefundRecordService;
import com.baojia.backstage.depositservice.modules.deposit.dao.RefundRecordMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
* @Title: RefundRecordServiceImpl  
* @Description:  退款流水实现类
* @author renjing  
* @date 2018年5月25日 下午6:30:21
 */
@Component
@Service(interfaceClass = RefundRecordService.class)
public class RefundRecordServiceImpl  extends ServiceImpl<RefundRecordMapper, RefundRecord> implements RefundRecordService{


}
