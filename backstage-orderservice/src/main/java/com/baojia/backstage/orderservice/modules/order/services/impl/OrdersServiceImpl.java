package com.baojia.backstage.orderservice.modules.order.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.domain.order.bo.OrdersBo;
import com.baojia.backstage.ordersdk.models.OrdersEntity;
import com.baojia.backstage.ordersdk.services.IOrdersService;
import com.baojia.backstage.orderservice.modules.order.dao.OrdersMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wxr
 * @Title: OrdersServiceImpl
 * @Description: 订单实现类
 * @date 2018/5/22 15:07
 */
@Component
@Service(version = "1.0.0")
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, OrdersEntity> implements IOrdersService {


    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageUtils complexOrdersPage(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<OrdersBo> orderList = baseMapper.complexOrdersPage();
        PageInfo<OrdersBo> pageInfo = new PageInfo<OrdersBo>(orderList);

        PageUtils page = new PageUtils(pageInfo.getList(), (int)pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getPageNum());
        return page;
    }
}
