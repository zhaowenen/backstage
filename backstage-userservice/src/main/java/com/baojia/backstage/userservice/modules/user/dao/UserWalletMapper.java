package com.baojia.backstage.userservice.modules.user.dao;


import com.baojia.backstage.domain.user.bo.UserInfoBo;
import com.baojia.backstage.domain.user.dto.UserDto;
import com.baojia.backstage.usersdk.models.UserEntity;
import com.baojia.backstage.usersdk.models.UserWalletEntity;
import com.baojia.backstage.usersdk.models.UserWalletLogEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 用户钱包相关方面的服务(包含押金)
 * @author YUANEL
 * @Title:
 * @date 2018/5/22 14:56
 */
@Repository
public interface UserWalletMapper extends BaseMapper<UserWalletEntity> {

    UserWalletEntity selectByUserIdForUpdate(String userId);

    void updateUserWallet(UserWalletEntity userWalletEntity);

    void insertUserWalletLog(UserWalletLogEntity userWalletLogEntity);
}
