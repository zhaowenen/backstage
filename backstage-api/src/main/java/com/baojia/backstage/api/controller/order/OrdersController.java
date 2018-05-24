package com.baojia.backstage.api.controller.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baojia.backstage.api.controller.sys.AbstractController;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.common.auth.util.R;
import com.baojia.backstage.domain.order.dto.OrdersDto;
import com.baojia.backstage.ordersdk.services.IOrdersService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

/**
 * @author wxr
 * @Title: OrdersController
 * @Description: 订单操作信息
 * @date 2018/5/22 15:50
 */
@RestController
@RequestMapping("orders")
public class OrdersController extends AbstractController {
    @Reference
    private IOrdersService ordersService;
    /**
     * 订单查询列表
     * @param ordersDto
     * @return
     */
    @ApiOperation(value="订单查询列表", notes="根据查询条件查询订单列表")
    @ApiImplicitParam(name = "OrdersDto", value = "订单复杂对象实体OrdersDto", required = true, dataType = "OrdersDto")
    @RequestMapping(value = "/list", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    @RequiresPermissions("orders:list")
    public R queryOrderPage(OrdersDto ordersDto){
        PageUtils page1 = ordersService.complexOrdersPage(ordersDto.getPageNum(),ordersDto.getPageSize());
        return R.ok().put("page", page1);
    }

    /**
     * 人工还车 调用APPserver的人工还车(人工还车先发闭锁指令，在调用APPserver的结束订单服务)
     * @param orderId 订单编号
     * @return
     */
    @ApiOperation(value="人工还车", notes="根据订单编号人工还车")
    @ApiImplicitParam(name = "orderId", value = "订单编号orderId", required = true, dataType = "Long")
    @RequestMapping(value = "/closeOrder", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    @RequiresPermissions("orders:closeOrder")
    public R closeOrder(Long orderId){
        return R.ok();
    }

    /**
     * 人工取消(先发闭锁指令，再调用APPserver的取消订单服务)
     * @param orderId
     * @return
     */
    @ApiOperation(value="人工取消", notes="根据订单编号人工取消订单")
    @ApiImplicitParam(name = "orderId", value = "订单编号orderId", required = true, dataType = "Long")
    @RequestMapping(value = "/cancelOrder", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    @RequiresPermissions("orders:cancelOrder")
    public R cancelOrder(Long orderId){
        return R.ok();
    }

    /**
     * 根据订单编号查询订单详情(订单基本信息，订单费用，订单车辆信息)
     * @param orderId 订单编号
     * @return
     */
//    @ApiOperation(value="订单详情", notes="根据订单编号查询订单详情")
//    @ApiImplicitParam(name = "orderId", value = "订单编号orderId", required = true, dataType = "Long")
//    @RequestMapping(value = "/cancelOrder", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
//    @RequiresPermissions("orders:cancelOrder")
//    public R getOrderDetailById(Long orderId){
//        return R.ok();
//    }
}
