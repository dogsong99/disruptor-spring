package com.dogsong.architecture.basic_di.h_aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
public class AwareApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfiguration.class);

        AwaredTestBean bbb = ctx.getBean(AwaredTestBean.class);

        bbb.printBeanNames();

        System.out.println("-----------");

        System.out.println(bbb.getBeanName());
    }

}
