package com.cps.www.respository;

import com.cps.www.entity.Poetry;

import java.util.List;

/**
 * 自定义的用户接口
 */
public interface CustomPoetryRepository {

    List<Poetry> search(String type, String key);
}
