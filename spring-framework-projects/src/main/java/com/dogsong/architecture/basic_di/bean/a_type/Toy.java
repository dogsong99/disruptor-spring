package com.dogsong.architecture.basic_di.bean.a_type;

import org.springframework.stereotype.Component;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
public abstract class Toy {

    private String name;

    public Toy(String name) {
        System.out.println("生产了一个" + name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
