package com.dogsong.architecture.lifecycle.c_initializingbean;

import com.dogsong.architecture.lifecycle.c_initializingbean.bean.Pen3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/23.
 */
@Configuration
public class ThirdCOnfiguration {

    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen3 pen() {
        return new Pen3();
    }

}
