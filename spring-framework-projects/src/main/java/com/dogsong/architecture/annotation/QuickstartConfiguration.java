package com.dogsong.architecture.annotation;

import com.dogsong.architecture.annotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
@Configuration
public class QuickstartConfiguration {

    @Bean
    public Person person() {
        return new Person();
    }

}
