package com.baojia.backstage.ordersdk.services;

import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.domain.order.dto.OrdersDto;

/**
 * @author wxr
 * @Title: ${file_name}
 * @Description: ${todo}
 * @date 2018/5/24 22:18
 */
public interface IOrdersSearchService {
    /**
 　　* @Description: 在Elasticsearch中根据预约类型、订单状态、
        下单开始时间、下单结束时间、模糊搜索包括用户姓名、电话号码、订单号、车牌号
 　　* @param ordersDto
 　　* @return PageUtils分页
 　　* @throws
 　　* @author wxr
 　　* @date 2018-05-24
     */
    PageUtils queryOrdersPage(OrdersDto ordersDto);

    void saveOrdersSearch();
    /**
　　* @Description: 根据用户id查询用户的最近一次订单
　　* @param userId 用户id
　　* @return Integer
　　* @throws
　　* @author wxr
　　* @date 2018-05-24
　　*/
    Integer getUserlastOrderInfo(int userId);
    void delete();
}
