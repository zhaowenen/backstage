package com.baojia.backstage.api.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baojia.backstage.api.controller.sys.AbstractController;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.common.auth.util.R;
import com.baojia.backstage.domain.user.bo.UserDetailBo;
import com.baojia.backstage.domain.user.dto.UserDto;
import com.baojia.backstage.domain.user.dto.UserOperateDto;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wxr
 * @Title: OrdersController
 * @Description: 用户管理操作信息
 * @date 2018/5/22 15:50
 */
@RestController
@RequestMapping("/users")
public class UsersController extends AbstractController {
    @Reference
  private IUserService userService;


    @ApiOperation(value="用户查询列表", notes="根据查询条件查询用户列表")
    @ApiImplicitParam(name = "UserDto", value = "用户复杂对象实体UserDto", required = true, dataType = "UserDto")
    @PostMapping(value = "/list", produces = {"application/json;charset=UTF-8"})
    @RequiresPermissions("users:list")
    public R queryUserPage(UserDto userDto){
        PageUtils page = userService.pageUserInfoBo(userDto.getPageNum(),userDto.getPageSize(),userDto);
        return R.ok().put("page", page);
    }

    @ApiOperation(value="用户解除验证码", notes="根据用户id对应的redis的key解除")
    @ApiImplicitParam(name = "userId", value = "解除用户验证码", required = true, dataType = "String")
    @PostMapping(value = "/relieveCode", produces = {"application/json;charset=UTF-8"})
    @RequiresPermissions("users:relieveCode")
    public R relieveVeriryCode(UserDto userDto){
        PageUtils page = userService.pageUserInfoBo(userDto.getPageNum(),userDto.getPageSize(),userDto);
        return R.ok().put("page", page);
    }

    @ApiOperation(value="用户锁定押金与解锁", notes="根据用户id锁定或解锁押金")
   /* @ApiImplicitParams({  @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "remarks", value = "锁定押金原因", required = false, dataType = "String")})*/
    @PostMapping(value = "/operateDepositStatus", produces = {"application/json;charset=UTF-8"})
   // @RequiresPermissions("users:operateDepositStatus")
    public R operateDepositStatus(UserOperateDto userOperateDto){
        boolean flag = false;
        if(StringUtils.isBlank(userOperateDto.getUserId()) || StringUtils.isBlank(userOperateDto.getOperateName())){
            throw  new IllegalArgumentException("请求参数异常");
        }
        if(StringUtils.isBlank(userOperateDto.getRemarks())){
            flag =  userService.unlockUserDeposit(userOperateDto.getUserId());
        }else{
            flag =  userService.lockUserDeposit(userOperateDto.getUserId(),userOperateDto.getRemarks());
        }
       return  flag?R.ok():R.error();
    }


    @ApiOperation(value="用户锁定押金与解锁", notes="根据用户id锁定或解锁押金")
   /* @ApiImplicitParams({  @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "remarks", value = "锁定押金原因", required = false, dataType = "String")})*/
    @PostMapping(value = "/operateUserBlackStatus", produces = {"application/json;charset=UTF-8"})
    // @RequiresPermissions("users:operateDepositStatus")
    public R operateUserBlackStatus(UserOperateDto userOperateDto) {
        boolean flag = false;
        if(StringUtils.isBlank(userOperateDto.getUserId()) || StringUtils.isBlank(userOperateDto.getOperateName())){
            throw  new IllegalArgumentException("请求参数异常");
        }
        if (StringUtils.isBlank(userOperateDto.getRemarks())) {
            flag = userService.liftBlack(userOperateDto.getUserId());
        } else {
            flag = userService.pullBlack(userOperateDto.getUserId(), userOperateDto.getRemarks());
        }
        return flag ? R.ok() : R.error();
    }


    @ApiOperation(value="获取用户详细信息", notes="获取用户详细信息")
   /* @ApiImplicitParams({  @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "remarks", value = "锁定押金原因", required = false, dataType = "String")})*/
    @PostMapping(value = "/getUserDeatil", produces = {"application/json;charset=UTF-8"})
    // @RequiresPermissions("users:operateDepositStatus")
    public R getUserDeatil(@RequestParam(value = "userId", required = true) String userId) {
        UserDetailBo userDetailBo = userService.getUserDetail(userId);
        return R.ok().put("userDeatail", userDetailBo);
    }
    @ApiOperation(value="获取用户拉黑记录", notes="分页获取用户拉黑记录")
   /* @ApiImplicitParams({  @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "remarks", value = "锁定押金原因", required = false, dataType = "String")})*/
    @PostMapping(value = "/getUerBlackLog", produces = {"application/json;charset=UTF-8"})
    // @RequiresPermissions("users:operateDepositStatus")
    public R getUerBlackLog(
            @RequestParam(value = "userId", required = true) String userId,
            @RequestParam(value = "pageNum", required = false,defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false,defaultValue = "10") int pageSize) {
        PageUtils page =  userService.pageUerBlackLog(pageNum,pageSize,userId);
        return R.ok().put("page", page);
    }

    @ApiOperation(value="获取用户锁定记录", notes="分页获取用户锁定记录")
   /* @ApiImplicitParams({  @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "remarks", value = "锁定押金原因", required = false, dataType = "String")})*/
    @PostMapping(value = "/getUserLockLog", produces = {"application/json;charset=UTF-8"})
    // @RequiresPermissions("users:operateDepositStatus")
    public R getUserLockLog(
            @RequestParam(value = "userId", required = true) String userId,
            @RequestParam(value = "pageNum", required = false,defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false,defaultValue = "10") int pageSize) {
        PageUtils page =  userService.pageUserLockLog(pageNum,pageSize,userId);
        return R.ok().put("page", page);
    }

    @ApiOperation(value="获取用户押金记录", notes="分页获取用户押金记录")
   /* @ApiImplicitParams({  @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "remarks", value = "锁定押金原因", required = false, dataType = "String")})*/
    @PostMapping(value = "/getUserDepositLog", produces = {"application/json;charset=UTF-8"})
    // @RequiresPermissions("users:operateDepositStatus")
    public R getUserDepositLog(
            @RequestParam(value = "userId", required = true) String userId,
            @RequestParam(value = "pageNum", required = false,defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false,defaultValue = "10") int pageSize) {
        PageUtils page =  userService.pageUserDepositLog(pageNum,pageSize,userId);
        return R.ok().put("page", page);
    }


      @ApiOperation(value="获取用户出行券记录", notes="分页获取用户出行券记录")
   /* @ApiImplicitParams({  @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "remarks", value = "锁定押金原因", required = false, dataType = "String")})*/
    @PostMapping(value = "/getUserCouponLog", produces = {"application/json;charset=UTF-8"})
    // @RequiresPermissions("users:operateDepositStatus")
    public R getUserCouponLog(
            @RequestParam(value = "userId", required = true) String userId,
            @RequestParam(value = "pageNum", required = false,defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false,defaultValue = "10") int pageSize) {
        PageUtils page =  userService.pageUserCouponLog(pageNum,pageSize,userId);
        return R.ok().put("page", page);
    }

    @ApiOperation(value="获取用户出余额记录", notes="分页获取用户余额记录")
   /* @ApiImplicitParams({  @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "remarks", value = "锁定押金原因", required = false, dataType = "String")})*/
    @PostMapping(value = "/getUserBalanceLog", produces = {"application/json;charset=UTF-8"})
    // @RequiresPermissions("users:operateDepositStatus")
    public R getUserBalanceLog(
            @RequestParam(value = "userId", required = true) String userId,
            @RequestParam(value = "pageNum", required = false,defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false,defaultValue = "10") int pageSize) {
        PageUtils page =  userService.pageUserBalanceLog(pageNum,pageSize,userId);
        return R.ok().put("page", page);
    }


   /* *//**
     * 人工还车 调用APPserver的人工还车(人工还车先发闭锁指令，在调用APPserver的结束订单服务)
     * @param orderId 订单编号
     * @return
     *//*
    @ApiOperation(value="人工还车", notes="根据订单编号人工还车")
    @ApiImplicitParam(name = "orderId", value = "订单编号orderId", required = true, dataType = "Long")
    @RequestMapping(value = "/closeOrder", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    @RequiresPermissions("orders:closeOrder")
    public R closeOrder(Long orderId){
        return R.ok();
    }

    *//**
     * 人工取消(先发闭锁指令，再调用APPserver的取消订单服务)
     * @param orderId
     * @return
     *//*
    @ApiOperation(value="人工取消", notes="根据订单编号人工取消订单")
    @ApiImplicitParam(name = "orderId", value = "订单编号orderId", required = true, dataType = "Long")
    @RequestMapping(value = "/cancelOrder", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    @RequiresPermissions("orders:cancelOrder")
    public R cancelOrder(Long orderId){
        return R.ok();
    }

    *//**
     * 根据订单编号查询订单详情(订单基本信息，订单费用，订单车辆信息)
     * @param orderId 订单编号
     * @return
     *//*
    @ApiOperation(value="订单详情", notes="根据订单编号查询订单详情")
    @ApiImplicitParam(name = "orderId", value = "订单编号orderId", required = true, dataType = "Long")
    @RequestMapping(value = "/cancelOrder", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    @RequiresPermissions("orders:cancelOrder")
    public R getOrderDetailById(Long orderId){
        return R.ok();
    }*/
}
