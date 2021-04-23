package com.dogsong.architecture.lifecycle.a_initmethod;

import com.dogsong.architecture.lifecycle.a_initmethod.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/22.
 */
@Configuration
@ComponentScan("com.dogsong.architecture.lifecycle.a_initmethod.bean")
public class BeanConfiguration {


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("wangwang");
        return dog;
    }

}
