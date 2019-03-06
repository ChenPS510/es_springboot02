package com.cps.www.dao;

import com.cps.www.entity.Poetry;

import java.util.List;

public interface PoetryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Poetry record);

    int insertSelective(Poetry record);

    Poetry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Poetry record);

    int updateByPrimaryKeyWithBLOBs(Poetry record);

    int updateByPrimaryKey(Poetry record);

    List<Poetry> selectAllPoetries();
}