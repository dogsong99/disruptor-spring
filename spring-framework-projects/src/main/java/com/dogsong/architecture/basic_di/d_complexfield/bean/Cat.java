package com.dogsong.architecture.basic_di.d_complexfield.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
public class Cat {

    private String name;


    private Person person;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
