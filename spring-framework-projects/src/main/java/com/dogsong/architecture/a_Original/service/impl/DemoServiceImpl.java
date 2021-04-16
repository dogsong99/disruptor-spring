package com.dogsong.architecture.a_Original.service.impl;


import com.dogsong.architecture.a_Original.dao.IDemoDao;
import com.dogsong.architecture.a_Original.factory.BeanFactory;
import com.dogsong.architecture.a_Original.service.IDemoService;

import java.util.List;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/16.
 */
public class DemoServiceImpl implements IDemoService {

    // private IDemoDao demoDao = new DemoDaoImpl();

    private IDemoDao demoDao = (IDemoDao) BeanFactory.getBean("demoDao");

    public DemoServiceImpl() {
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }

    @Override
    public List<String> findAll() {

        return demoDao.findAll();

    }

}
