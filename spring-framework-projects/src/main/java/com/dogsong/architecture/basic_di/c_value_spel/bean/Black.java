package com.dogsong.architecture.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
@Component
public class Black {

    @Value("black-value-anno")
    private String name;

    @Value("0")
    private Integer order;

    @Override
    public String toString() {
        return "Black{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
