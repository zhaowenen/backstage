package com.baojia.backstage.ordersdk.services;

import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.ordersdk.models.UserEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * 用户管理服务相关
 * @Auther: YUANERL
 * @Date: 2018/5/24 10:23
 * @Description:
 */
public interface UserService extends IService<UserEntity> {

    PageUtils  pageInfo(int pageNum, int pageSize);


    PageUtils  pageInfoByMap(int pageNum, int pageSize, Map<String,Object> param);


}
