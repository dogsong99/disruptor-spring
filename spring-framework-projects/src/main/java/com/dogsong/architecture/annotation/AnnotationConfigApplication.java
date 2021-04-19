package com.dogsong.architecture.annotation;

import com.dogsong.architecture.annotation.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
public class AnnotationConfigApplication {

    public static void main(String[] args) {
        // ApplicationContext cxt = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);

        // 或者直接扫描com.dogsong.carchitecture.annotation包
        String[] beanNames = ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);

    }

}
