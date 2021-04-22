package com.dogsong.architecture.basic_di.bean.a_type;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author domisong.
 * @description:
 *          FactoryBean 本身的加载是伴随 IOC 容器的初始化时机一起的
 *          FactoryBean 生产 Bean 的机制是延迟生产
 *          FactoryBean 默认生成的 Bean 确实是单实例的
 * @date 2021/4/20.
 */
public class ToyFactoryBean implements FactoryBean<Toy> {

    private Child child;

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                // SpringFramework2.0开始允许返回null
                // 之前的1.x版本是不允许的
                return null;
        }
    }

    @Override
    public Class<Toy> getObjectType() {
        return Toy.class;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public ToyFactoryBean() {
        System.out.println("ToyFactoryBean 初始化了...");
    }

}
