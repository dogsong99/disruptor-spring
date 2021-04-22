package com.dogsong.architecture.basic_di.bean.a_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
public class BeanTypeAnnoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);

        Toy toy = ctx.getBean(Toy.class);
        System.out.println(toy);
    }

}
