package com.dogsong.architecture.basic_di.h_aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.NamedBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
public class AwaredTestBean implements ApplicationContextAware, BeanNameAware, NamedBean {

    private String beanName;
    private ApplicationContext ctx;



    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }

    public void printBeanNames() {
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public String getBeanName() {
        return beanName;
    }
}
