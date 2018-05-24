package com.baojia.backstage.userservice.modules.user.dao;


import com.baojia.backstage.ordersdk.models.UserEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * @author wxr
 * @Title: 用户管理
 * @date 2018/5/22 14:56
 */
public interface UserMapper extends BaseMapper<UserEntity> {

    List<UserEntity> selectAll();

    List<UserEntity> selectByMap(Map<String,Object> param);



}
