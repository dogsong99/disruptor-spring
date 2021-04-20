package com.dogsong.architecture.basic_di.d_complexfield.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
@Component
public class Dog {


    @Value("dogdog")
    private String name;

    @Autowired
    @Qualifier("administrator")
    private Person person;


    @Autowired
    private List<Person> personList;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", person=" + person +
                ", personList=" + personList +
                '}';
    }
}
