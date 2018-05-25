package com.baojia.backstage.orderservice.modules.order.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.domain.order.bo.OrdersBo;
import com.baojia.backstage.ordersdk.models.OrdersEntity;
import com.baojia.backstage.ordersdk.services.IOrdersService;
import com.baojia.backstage.orderservice.common.utils.OkHttpUtil;
import com.baojia.backstage.orderservice.modules.order.dao.OrdersMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wxr
 * @Title: OrdersServiceImpl
 * @Description: 订单实现类
 * @date 2018/5/22 15:07
 */
@Component
@Service(interfaceClass = IOrdersService.class)
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, OrdersEntity> implements IOrdersService {
    @Qualifier(value = "okHttpUtil")
    private OkHttpUtil okHttpUtil;
    @Value("${lock.bike.command.url}")
    private String lockBikeUrl;

    /**
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * @return
     * */
    /*@Override*/
    public PageUtils complexOrdersPage(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<OrdersBo> orderList = baseMapper.complexOrdersPage();
        PageInfo<OrdersBo> pageInfo = new PageInfo<OrdersBo>(orderList);

        PageUtils page = new PageUtils(pageInfo.getList(), (int)pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getPageNum());
        return page;
    }
    /**
     * 根据订单编号，将订单改为待支付，由APP结束订单
     * @param orderId  订单编号
     * @return int
     * @author wxr
     * @date 2018/5/23
     */
    /*@Override*/
    public int closeOrder(Long orderId) {
        OrdersEntity ordersEntity = new OrdersEntity();
        ordersEntity.setOrderId(orderId);
        ordersEntity.setOrderStatus(1);//设置订单状态
        return baseMapper.updateById(ordersEntity);
    }
    /**
     * 蜜步运营平台发送还车指令，不需要关心返回结果
     * @param bikeNum  bee+终端编号
     * @param from  来源 operatePlatform
     * @author wxr
     * @date 2018/5/23
     */
    /*@Override*/
    public void sendReturnBikeCommand(String bikeNum, String from) {
        Map<String,String> paramMap = new HashMap<String,String>();
        paramMap.put("carId","bee"+bikeNum);
        paramMap.put("cmd","carControl");
        paramMap.put("type","1");
        paramMap.put("command","4");
        paramMap.put("_frm","operatePlatform");
        okHttpUtil.post(lockBikeUrl,paramMap);
    }

    /**
     * 根据订单编号设置订单状态为已取消，此功能为取消订单
     * @param orderId 订单编号
     * @return
     */
    /*@Override*/
    public int cancelOrder(Long orderId){
        OrdersEntity ordersEntity = new OrdersEntity();
        ordersEntity.setOrderId(orderId);
        ordersEntity.setOrderStatus(1);//设置订单状态为已取消
        return baseMapper.updateById(ordersEntity);
    }

    /**
     * 根据订单编号查询订单相关信息(订单基本信息，费用信息，车辆信息，操作记录等等)
     * @param orderId 订单编号
     * @return
     */
    public Map<String,Object> getOrderDetailById(Long orderId){
        //1.订单基本详情 车辆位置和费用

        //指令操作时间记录

        return null;
    }
}
