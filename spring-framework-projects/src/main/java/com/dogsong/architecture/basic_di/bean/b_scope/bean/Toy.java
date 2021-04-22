package com.dogsong.architecture.basic_di.bean.b_scope.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
@Component
// @Scope("prototype")
public class Toy {

    public Toy() {
        System.out.println("Toy constructor run ...");
    }

}
