package com.baojia.backstage.ordersdk.services;

import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.ordersdk.models.OrdersEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;

/**
 * @author wxr
 * @Title: 订单服务
 * @Description: dubbo
 * @date 2018/5/22 14:22
 */
public interface IOrdersService extends IService<OrdersEntity>{
    /**
     * 根据条件查询订单信息列表-组合为复杂对象
     * @param pageNum  第几页
     * @param pageSize 每页几条
     * @return
     */
    PageUtils complexOrdersPage(int pageNum, int pageSize);

    /**
     * 根据订单编号，由APP结束订单，人工结束订单
     * @param orderId  订单编号
     * @return int
     * @author wxr
     * @date 2018/5/23
     */
    int closeOrder(Long orderId);

    /**
     * 蜜步运营平台发送还车指令，不需要关心返回结果
     * @param bikeNum  bee+终端编号
     * @param from  来源 operatePlatform运营平台自定义
     * @author wxr
     * @date 2018/5/23
     */
    void  sendReturnBikeCommand(String bikeNum,String from);

    /**
     * 根据订单编号人工取消订单
     * @param orderId 订单编号
     * @return
     */
    int cancelOrder(Long orderId);

    /**
     * 根据订单编号查询订单相关信息(订单基本信息，费用信息，车辆信息，操作记录等等)
     * @param orderId 订单编号
     * @return
     */
    Map<String,Object> getOrderDetailById(Long orderId);
}
