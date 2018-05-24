package com.baojia.backstage.userservice.modules.user.dao;

import com.baojia.backstage.usersdk.models.UserCouponEntity;
import com.baojia.backstage.usersdk.models.UserEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @Auther: YUANEL
 * @Date: 2018/5/24 14:17
 * @Description:
 */
@Repository
public interface UserCouponMapper  extends BaseMapper<UserCouponEntity> {

        Integer countValidNum(String userId);


}
