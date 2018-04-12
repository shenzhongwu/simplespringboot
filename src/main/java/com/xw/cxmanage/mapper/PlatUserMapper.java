package com.xw.cxmanage.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.xw.cxmanage.domain.PlatUser;
public interface PlatUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(PlatUser record);

    int insertSelective(PlatUser record);

    PlatUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(PlatUser record);

    int updateByPrimaryKey(PlatUser record);
}