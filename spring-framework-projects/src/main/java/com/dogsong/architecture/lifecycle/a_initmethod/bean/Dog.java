package com.dogsong.architecture.lifecycle.a_initmethod.bean;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/22.
 */
public class Dog {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println(name + "被初始化了。。。");
    }
    public void destroy() {
        System.out.println(name + "被销毁了。。。");
    }


}
