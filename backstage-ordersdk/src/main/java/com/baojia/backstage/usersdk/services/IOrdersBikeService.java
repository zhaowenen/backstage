package com.baojia.backstage.usersdk.services;

import java.util.Map;

import com.baojia.backstage.usersdk.models.OrdersBikeEntity;
import com.baomidou.mybatisplus.service.IService;

/**
 * @author wxr
 * @Title: 订单车辆服务
 * @Description: dubbo
 * @date 2018/5/22 14:22
 */
public interface IOrdersBikeService extends IService<OrdersBikeEntity>{
    /**
 　　* @Description: 根据订单编号查询订单车辆信息
 　　* @param orderNo ,num
 　　* @return OrdersBikeEntity
 　　* @throws
 　　* @author wxr
 　　* @date 2018/5/26
 　　*/
    OrdersBikeEntity getOrdersBikeByOid(Map<String,Object> map);

}
