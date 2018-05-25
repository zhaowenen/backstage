package com.baojia.backstage.userservice.modules.user.dao;


import com.baojia.backstage.domain.user.bo.UserDetailBo;
import com.baojia.backstage.domain.user.bo.UserInfoBo;
import com.baojia.backstage.domain.user.bo.UserOperateLogBo;
import com.baojia.backstage.domain.user.dto.UserDto;
import com.baojia.backstage.usersdk.models.UserEntity;
import com.baojia.backstage.usersdk.models.UserOperateLogEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @authorYUANEL
 * @Title: 用户管理
 * @date 2018/5/22 14:56
 */
@Repository
public interface UserDetailMapper extends BaseMapper<UserDetailBo> {

   UserDetailBo selectUserDatail(String userId);

   List<UserOperateLogBo> listUserBlackLog(String userId);

   List<UserOperateLogBo> listUserLockLog(String userId);



}
