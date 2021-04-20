package com.dogsong.architecture.basic_di.a_quickstart_set;

import com.dogsong.architecture.basic_di.a_quickstart_set.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
public class SetConfigApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(XmlConfiguration.class);

        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }

}
