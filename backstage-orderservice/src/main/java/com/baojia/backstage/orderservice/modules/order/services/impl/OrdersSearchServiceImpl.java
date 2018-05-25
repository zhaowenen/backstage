package com.baojia.backstage.orderservice.modules.order.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.domain.order.dto.OrdersDto;
import com.baojia.backstage.ordersdk.services.IOrdersSearchService;
import com.baojia.backstage.ordersdk.searchs.OrdersSearch;
import com.baojia.backstage.orderservice.modules.order.search.dao.OrdersSearchRepository;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchPhraseQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author wxr
 * @Title: OrdersSearchServiceImpl
 * @Description: 用户订单的Elasticsearch的实现类
 * @date 2018/5/24 18:13*/

@Component
@Service(interfaceClass = IOrdersSearchService.class)
public class OrdersSearchServiceImpl implements IOrdersSearchService{
    @Qualifier(value = "ordersSearchRepository")
    @Autowired
    private OrdersSearchRepository ordersSearchRepository;
    /**
    　　* @Description: 在Elasticsearch中根据预约类型、订单状态、
                        下单开始时间、下单结束时间、模糊搜索包括用户姓名、电话号码、订单号、车牌号
    　　* @param ordersDto
    　　* @return PageUtils分页
    　　* @throws
    　　* @author wxr
    　　* @date 2018-05-24
     */
    public PageUtils queryOrdersPage(OrdersDto ordersDto){
        //分页参数
        Pageable pageable = new PageRequest(ordersDto.getPageNum()-1,ordersDto.getPageSize());
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        if(ordersDto.getOrderType()!=null){//预约类型
            boolQueryBuilder.must(QueryBuilders.termQuery("orderType",ordersDto.getOrderType()));//预约类型
        }
        if(ordersDto.getOrderStatus()!=null){//订单状态
            boolQueryBuilder.must(QueryBuilders.termQuery("orderStatus",ordersDto.getOrderStatus()));//订单状态
        }
        if(ordersDto.getBeginTime()!=null&&!ordersDto.getBeginTime().equals("")){//下单开始时间
            boolQueryBuilder.filter(QueryBuilders.rangeQuery("createTime").gte(ordersDto.getBeginTime()));
        }
        if(ordersDto.getEndTime()!=null&&!ordersDto.getEndTime().equals("")){//下单结束时间
            boolQueryBuilder.filter(QueryBuilders.rangeQuery("createTime").lte(ordersDto.getEndTime()));
        }
        if(ordersDto.getConditionType()!=null&&ordersDto.getConditionType().equals("userName")){//用户姓名
            boolQueryBuilder.must(QueryBuilders.fuzzyQuery("userName",ordersDto.getKeyWords()));
        }
        if(ordersDto.getConditionType()!=null&&ordersDto.getConditionType().equals("userMobile")){//电话号码
            boolQueryBuilder.must(QueryBuilders.fuzzyQuery("userMobile",ordersDto.getKeyWords()));
        }
        if(ordersDto.getConditionType()!=null&&ordersDto.getConditionType().equals("orderNo")){//订单号
            boolQueryBuilder.must(QueryBuilders.fuzzyQuery("orderNo",ordersDto.getKeyWords()));
        }
        if(ordersDto.getConditionType()!=null&&ordersDto.getConditionType().equals("plateNo")){//车牌号
            boolQueryBuilder.must(QueryBuilders.fuzzyQuery("plateNo",ordersDto.getKeyWords()));
        }
        //根据es主键id进行排序
        FieldSortBuilder sort = SortBuilders.fieldSort("orderId").order(SortOrder.DESC);

        //构建查询
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        //将搜索条件设置到构建中
        nativeSearchQueryBuilder.withQuery(boolQueryBuilder);
        //将分页设置到构建中
        nativeSearchQueryBuilder.withPageable(pageable);
        //将排序设置到构建中
        nativeSearchQueryBuilder.withSort(sort);
        //生产NativeSearchQuery
        NativeSearchQuery query = nativeSearchQueryBuilder.build();


        Page<OrdersSearch> ordersSearches = ordersSearchRepository.search(query);

        //获取总条数(前端分页需要使用)
        int total = (int) ordersSearches.getTotalElements();

        //获取查询到的数据内容
        List<OrdersSearch> content = ordersSearches.getContent();
        PageUtils page = new PageUtils(content, total, ordersSearches.getTotalPages(), ordersDto.getPageSize());
        return page;
    }

    /**
     * 插入订单信息到es中
     */
    public void saveOrdersSearch(){
        for(int i=0;i<5;i++){
            OrdersSearch ordersSearch = new OrdersSearch();
            ordersSearch.setId(Long.valueOf(i+1));
            ordersSearch.setOrderId(i+1);
            ordersSearch.setOrderType(2);
            ordersSearch.setOrderNo(Math.random()+"");
            ordersSearch.setUserId(i%1==0?1:2);
            ordersSearch.setUserName("wxr"+i);
            ordersSearch.setUserMobile("123456"+i);
            ordersSearch.setCreateTime(new Date());
            ordersSearchRepository.save(ordersSearch);
        }



    }
    /**
 　　* @Description: 根据用户id查询用户的最近一次订单
 　　* @param userId 用户id
 　　* @return int
 　　* @throws
 　　* @author wxr
 　　* @date 2018-05-24
 　　*/
    public Integer getUserlastOrderInfo(int userId){
        Pageable pageable = new PageRequest(0,1);
        QueryBuilder queryBuilder = QueryBuilders.boolQuery().must(QueryBuilders.termQuery("userId",userId));
        //根据es主键id进行排序
        FieldSortBuilder sort = SortBuilders.fieldSort("createTime").order(SortOrder.DESC);

        //构建查询
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        //将排序设置到构建中
        nativeSearchQueryBuilder.withSort(sort);
        //将搜索条件设置到构建中
        nativeSearchQueryBuilder.withQuery(queryBuilder);
        //将分页设置到构建中
        nativeSearchQueryBuilder.withPageable(pageable);
        //生产NativeSearchQuery
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        Page<OrdersSearch> ordersSearches = ordersSearchRepository.search(query);
        if(ordersSearches!=null&&ordersSearches.getContent().size()>0){
            OrdersSearch ordersSearch = ordersSearches.getContent().get(0);
            return ordersSearch.getOrderId();
        }
        return null;
    }


    public void delete(){
        ordersSearchRepository.deleteAll();
    }
}
