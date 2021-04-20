package com.dogsong.architecture.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
@Component
public class Blue {

    @Value("#{'blue-value-byspel'}")
    public String name;


    @Value("#{2}")
    public Integer order;

    public void setName(String name) {
        this.name = name;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Blue{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
