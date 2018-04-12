package com.xw.cxmanage.service;

import com.xw.cxmanage.domain.PlatUser;

/**
 * Created by shenzhongwu on 2018年4月9日
 */
public interface PlatUserService {
	 PlatUser selectByPrimaryKey(String userId);
}
