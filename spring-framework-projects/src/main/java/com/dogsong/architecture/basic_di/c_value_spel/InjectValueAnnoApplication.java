package com.dogsong.architecture.basic_di.c_value_spel;

import com.dogsong.architecture.basic_di.c_value_spel.bean.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
public class InjectValueAnnoApplication {

    public static void main(String[] args) {
        // ApplicationContext ctx = new AnnotationConfigApplicationContext("com.dogsong.architecture.basic_di.c_value_spel.bean");
        // Black black = ctx.getBean(Black.class);
        // System.out.println("simple value : " + black);

        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Red red = ctx2.getBean(Red.class);
        System.out.println("properties value : " + red);

        // xml方式获取
        // BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/c_value_spel/inject-red.xml");
        // Red red2 = beanFactory.getBean(Red.class);
        // System.out.println(red2);

        Blue blue = ctx2.getBean(Blue.class);
        System.out.println("blue is : " + blue);

        Green green = ctx2.getBean(Green.class);
        System.out.println(green);

        White white = ctx2.getBean(White.class);
        System.out.println(white);
    }

}
