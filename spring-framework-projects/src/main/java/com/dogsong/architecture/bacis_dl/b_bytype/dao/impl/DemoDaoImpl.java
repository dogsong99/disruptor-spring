package com.dogsong.architecture.bacis_dl.b_bytype.dao.impl;

import com.dogsong.architecture.bacis_dl.b_bytype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/17.
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        // 此处应该是访问数据库的操作，用临时数据代替
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
