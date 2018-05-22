package com.baojia.backstage.api.controller.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baojia.backstage.api.controller.sys.AbstractController;
import com.baojia.backstage.common.auth.util.R;
import com.baojia.backstage.domain.order.dto.OrdersDto;
import com.baojia.backstage.ordersdk.services.IOrdersService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

/**
 * @author wxr
 * @Title: OrdersController
 * @Description: 订单操作信息
 * @date 2018/5/22 15:50
 */
@RestController
@RequestMapping("/orders")
public class OrdersController extends AbstractController {
    @Reference
    private IOrdersService ordersService;
    /**
     * 订单查询列表
     * @param ordersDto
     * @return
     */
    @RequestMapping(value = "/list", produces = {"application/json;charset=UTF-8"})
    @RequiresPermissions("orders:list")
    public R findAllUser(@RequestBody OrdersDto ordersDto){
        return R.ok().put("page", ordersService.complexOrdersPage(ordersDto.getPageNum(),ordersDto.getPageSize()));
    }
}
