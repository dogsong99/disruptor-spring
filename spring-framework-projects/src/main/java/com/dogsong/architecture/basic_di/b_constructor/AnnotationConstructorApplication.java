package com.dogsong.architecture.basic_di.b_constructor;

import com.dogsong.architecture.basic_di.b_constructor.config.AnnotationConfiguration;
import com.dogsong.architecture.basic_di.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
public class AnnotationConstructorApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);

        Person person = ctx.getBean(Person.class);

        System.out.println(person);

    }

}
