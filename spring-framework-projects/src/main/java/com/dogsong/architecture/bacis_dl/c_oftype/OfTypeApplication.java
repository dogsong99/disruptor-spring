package com.dogsong.architecture.bacis_dl.c_oftype;

import com.dogsong.architecture.bacis_dl.c_oftype.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/17.
 */
public class OfTypeApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-oftype.xml");

        Map<String, DemoDao> beans = ctx.getBeansOfType(DemoDao.class);

        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + " : " + bean.toString());
        });
    }

}
