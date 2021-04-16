package com.dogsong.architecture.a_Original.dao.impl;


import com.dogsong.architecture.a_Original.dao.IDemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/16.
 */
public class DemoDaoImpl implements IDemoDao {

    @Override
    public List<String> findAll() {
        // 此处应该是访问数据库的操作，用临时数据代替
        return Arrays.asList("aaa", "bbb", "ccc");
    }

}
