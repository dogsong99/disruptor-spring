package com.dogsong.architecture.basic_di.a_quickstart_set;

import com.dogsong.architecture.basic_di.a_quickstart_set.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
@Configuration
public class XmlConfiguration {

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("test-person-anno-byset");
        person.setAge(18);
        return person;
    }

}
