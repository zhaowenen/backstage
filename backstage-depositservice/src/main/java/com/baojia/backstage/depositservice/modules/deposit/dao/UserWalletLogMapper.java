package com.baojia.backstage.depositservice.modules.deposit.dao;

import com.baojia.backstage.depositsdk.service.models.UserWalletLog;

public interface UserWalletLogMapper {
	
	int deleteByPrimaryKey(Long id);

	int insert(UserWalletLog record);

	int insertSelective(UserWalletLog record);

	UserWalletLog selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(UserWalletLog record);

	int updateByPrimaryKey(UserWalletLog record);
}