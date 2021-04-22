package com.dogsong.architecture.basic_di.bean.b_scope.bean;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
public class Child {

    private Toy toy;

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Child{" +
                "toy=" + toy +
                '}';
    }
}
