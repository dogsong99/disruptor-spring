package com.dogsong.architecture.basic_di.d_complexfield.bean;

import org.springframework.stereotype.Component;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
@Component("administrator")
public class Person {

    private String name = "administrator";

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
