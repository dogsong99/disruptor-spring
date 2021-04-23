package com.dogsong.architecture.lifecycle.a_initmethod.bean;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/22.
 */
public class Cat {

    private String name;

    public void setName(String name) {
        System.out.println("setName方法执行了。。。");
        this.name = name;
    }

    public Cat() {
        System.out.println("Cat 构造方法执行了。。。");
    }

    public void init() {
        System.out.println(name + "被初始化了。。。");
    }
    public void destroy() {
        System.out.println(name + "被销毁了。。。");
    }

}
