package com.xw.cxmanage.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xw.cxmanage.domain.PlatUser;
import com.xw.cxmanage.mapper.PlatUserMapper;
import com.xw.cxmanage.service.PlatUserService;

/**
 * Created by shenzhongwu on 2018年4月9日
 */
@Service
public class PlatUserServiceImpl implements PlatUserService {
	
	@Autowired
	PlatUserMapper platUserMapper;
	@Override
	public PlatUser selectByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return platUserMapper.selectByPrimaryKey(userId);
	}

}
