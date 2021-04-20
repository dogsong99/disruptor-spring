package com.dogsong.architecture.basic_di.d_complexfield;

import com.dogsong.architecture.basic_di.d_complexfield.bean.Cat;
import com.dogsong.architecture.basic_di.d_complexfield.bean.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
@Configuration
@ComponentScan("com.dogsong.architecture.basic_di.d_complexfield.bean")
public class InjectComplexFieldConfiguration {


    @Bean
    public Cat cat(@Qualifier("master") Person person) {
        Cat cat = new Cat();
        cat.setName("mimi");
        cat.setPerson(person);
        return cat;
    }

    @Bean
    @Primary
    public Person master() {
        Person master = new Person();
        master.setName("master");
        return master;
    }
}
