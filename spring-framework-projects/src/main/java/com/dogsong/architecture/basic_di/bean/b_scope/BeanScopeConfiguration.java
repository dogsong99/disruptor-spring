package com.dogsong.architecture.basic_di.bean.b_scope;


import com.dogsong.architecture.basic_di.bean.b_scope.bean.Child;
import com.dogsong.architecture.basic_di.bean.b_scope.bean.Toy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
@Configuration
@ComponentScan("com.dogsong.architecture.basic_di.bean.b_scope.bean")
public class BeanScopeConfiguration {

    @Bean
    public Child child1(Toy toy) {
        Child child = new Child();
        child.setToy(toy);
        return child;
    }

    @Bean
    public Child child2(Toy toy) {
        Child child = new Child();
        child.setToy(toy);
        return child;
    }

}
