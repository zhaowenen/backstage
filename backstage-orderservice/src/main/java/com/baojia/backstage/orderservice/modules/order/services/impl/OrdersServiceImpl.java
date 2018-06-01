package com.baojia.backstage.orderservice.modules.order.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.domain.order.bo.OrdersBo;
import com.baojia.backstage.ordersdk.models.*;
import com.baojia.backstage.ordersdk.searchs.OrdersSearch;
import com.baojia.backstage.ordersdk.services.*;
import com.baojia.backstage.orderservice.common.utils.OkHttpUtil;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
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
public class OrdersServiceImpl extends ServiceImpl<com.baojia.backstage.userservice.modules.user.dao.OrdersMapper, OrdersEntity> implements IOrdersService {
    @Qualifier(value = "okHttpUtil")
    private OkHttpUtil okHttpUtil;
    @Value("${lock.bike.command.url}")
    private String lockBikeUrl;
    @Autowired
    private IOrdersBikeService ordersBikeService;
    @Autowired
    private IOrdersUserService ordersUserService;
    @Autowired
    private IOrdersOperateService ordersOperateService;
    @Autowired
    private IPaymentRecordService paymentRecordService;

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
        //1.对orderId进行取模然后查询对应的表信息
        int num = (int)(orderId%10);
        Map<String,Object> map = new HashMap<>();
        map.put("orderId",orderId);
        map.put("num",num);
        OrdersEntity ordersEntity =  baseMapper.getOrderById(map);
        //2.订单车辆
        OrdersBikeEntity ordersBikeEntity = ordersBikeService.getOrdersBikeByOid(map);
        //订单用户
        OrdersUserEntity  ordersUserEntity = ordersUserService.getOrdersUserByOid(map);
        //订单操作记录
        List<OrdersOperateEntity> listOperate = ordersOperateService.listOrdersOperateByOid(map);
        //订单支付
        PaymentRecordEntity paymentRecordEntity = paymentRecordService.getPaymentRecordByOid(map);
        OrdersSearch ordersSearch = new OrdersSearch();
        ordersSearch.setOrderType(ordersEntity.getOrderType());//订单类型
        ordersSearch.setBikeTakeMileage(ordersBikeEntity.getTakeMileage());//取车时续航里程
        ordersSearch.setOrderStatus(ordersEntity.getOrderStatus());//订单状态
        ordersSearch.setBikeTakeAdress(ordersBikeEntity.getTakeAdress());//取车时车辆位置
        ordersSearch.setUserName("");//用户姓名
        ordersSearch.setUserTakeAdress(ordersUserEntity.getUserTakeAdress());//取车时手机位置
        ordersSearch.setUserMobile(ordersUserEntity.getUserMobile());//用户手机号码
        ordersSearch.setBikeReturnAdress(ordersBikeEntity.getReturnAdress());//还车时车辆位置
        ordersSearch.setCreateTime(ordersEntity.getCreateTime());//订单创建时间
        ordersSearch.setUserReturnAdress(ordersUserEntity.getUserReturnAdress());//还车时手机位置
        ordersSearch.setPlateNo(ordersBikeEntity.getPlateNo());//车牌号
        ordersSearch.setReturnBikeTime(ordersBikeEntity.getCreateTime());//还车时间
        ordersSearch.setAppVersion(ordersUserEntity.getAppVersion());//下单是APP版本
        ordersSearch.setRidingTime(0.0);//骑行时长
        ordersSearch.setOrderAmount(ordersEntity.getOrderAmount());//应收订单总费用
        ordersSearch.setTimeAmount(new BigDecimal(0));//时长费用
        ordersSearch.setMileageAmount(new BigDecimal(0));//里程费用
        ordersSearch.setActivityAmount(ordersEntity.getActivityAmount());//活动抵扣
        ordersSearch.setOrdersMileage(ordersBikeEntity.getOrderMileage());//骑行里程
        ordersSearch.setCouponAmount(ordersEntity.getCouponAmount());//活动劵抵扣
        ordersSearch.setCouponId(ordersEntity.getCouponId());//活动劵id
        ordersSearch.setPayAmount(ordersEntity.getPayAmount());//实际支付费用
        ordersSearch.setPaymentType(ordersEntity.getPayMethod());//支付方式
        ordersSearch.setGiveMiAmount(ordersEntity.getGiveMiAmount());//扣减赠送的蜜币
        ordersSearch.setMiAmount(ordersEntity.getMiAmount());//扣减的充值蜜币

        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("ordersSearch",ordersSearch);
        resultMap.put("operateList",listOperate);

        return resultMap;
    }
    /**
 　　* @Description: 根据订单编号查询订单基本详情信息
 　　* @param orderId
 　　* @return OrdersEntity
 　　* @throws
 　　* @author wxr
 　　* @date 2018/5/26
 　　*/
    public OrdersEntity getOrderById(Long orderId){
        Map<String,Object> map = new HashMap<>();
        map.put("orderId",orderId);
        map.put("num",(int) (orderId%10));
        return baseMapper.getOrderById(map);
    }

}
