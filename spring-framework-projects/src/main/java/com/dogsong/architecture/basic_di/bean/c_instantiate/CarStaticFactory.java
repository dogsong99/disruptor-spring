package com.dogsong.architecture.basic_di.bean.c_instantiate;

import com.dogsong.architecture.basic_di.bean.c_instantiate.bean.Car;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/22.
 */
public class CarStaticFactory {

    public static Car getCar() {
        return new Car();
    }

}
