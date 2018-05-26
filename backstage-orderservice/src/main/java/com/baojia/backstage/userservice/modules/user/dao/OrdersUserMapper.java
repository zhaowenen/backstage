package com.baojia.backstage.userservice.modules.user.dao;

import com.baojia.backstage.usersdk.models.OrdersUserEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.Map;

/**
 * @author wxr
 * @Title: 订单用户
 * @date 2018/5/22 15:05
 */
public interface OrdersUserMapper extends BaseMapper<OrdersUserEntity>{
    /**
 　　* @Description: 根据取模的数字，选择取第几个订单表orders_user
 　　* @param orderId-订单编号，num取模数字
 　　* @return OrdersUserEntity
 　　* @throws
 　　* @author wxr
 　　* @date 2018/5/25 15:02
 　　*/
    OrdersUserEntity getOrderUserByOid(Map<String,Object> map);
}
