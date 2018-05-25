package com.baojia.backstage.orderservice.modules.order.search.dao;

import com.baojia.backstage.ordersdk.searchs.OrdersSearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author wxr
 * @Title: OrdersSearchRepository1
 * @Description: 订单elasticsearch查询接口
 * @date 2018/5/24 17:31
 */
@Component
public interface OrdersSearchRepository extends ElasticsearchRepository<OrdersSearch, Long> {

}
