package com.dogsong.architecture.basic_di.bean;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/17.
 */
public class Cat {

    private String name;

    private Person master;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", master=" + master +
                '}';
    }
}
