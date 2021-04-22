package com.dogsong.architecture.basic_di.bean.c_instantiate;

import com.dogsong.architecture.basic_di.bean.c_instantiate.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/22.
 */
@Configuration
@ComponentScan("com.dogsong.architecture.basic_di.bean.c_instantiate.bean")
public class BeanConfiguration {

    @Bean
    public BallFactoryBean ballFactoryBean() {
        return new BallFactoryBean();
    }

    @Bean
    public Car car2() {
        return CarStaticFactory.getCar();
    }

    /*@Bean
    public Car car3(CarInstanceFactory carInstanceFactory) {
        return carInstanceFactory.getCar();
    }*/
}
