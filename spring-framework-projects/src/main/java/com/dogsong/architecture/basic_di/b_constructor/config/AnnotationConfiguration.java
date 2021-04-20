package com.dogsong.architecture.basic_di.b_constructor.config;

import com.dogsong.architecture.basic_di.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
@Configuration
public class AnnotationConfiguration {

    @Bean
    public Person person() {
        return new Person("test-person-anno-byconstructor", 18);
    }

}
