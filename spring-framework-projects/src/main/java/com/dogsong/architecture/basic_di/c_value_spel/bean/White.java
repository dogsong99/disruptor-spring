package com.dogsong.architecture.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
@Component
public class White {

    @Value("#{blue.name.substring(0, 3)}")
    private String name;

    @Value("#{T(java.lang.Integer).MAX_VALUE}")
    private Integer order;

    public void setName(String name) {
        this.name = name;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "White{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
