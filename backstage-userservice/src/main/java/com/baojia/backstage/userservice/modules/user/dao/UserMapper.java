package com.baojia.backstage.userservice.modules.user.dao;


import com.baojia.backstage.domain.user.bo.UserInfoBo;
import com.baojia.backstage.domain.user.dto.UserDto;
import com.baojia.backstage.usersdk.models.UserEntity;
import com.baojia.backstage.usersdk.models.UserOperateLogEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * @authorYUANEL
 * @Title: 用户管理
 * @date 2018/5/22 14:56
 */
public interface UserMapper extends BaseMapper<UserEntity> {

    List<UserEntity> selectAll();

    List<UserEntity> selectByMap(Map<String,Object> param);

    List<UserInfoBo> listByUserDto(UserDto usersDto);

    Integer countValidNum(String userId,String nowTime);

    UserEntity selectByUserIdForUpdate(String userId);

    void updateUserEntity(UserEntity userEntity);

    void insertUserOperateLog(UserOperateLogEntity userOperateLogEntity);

}
