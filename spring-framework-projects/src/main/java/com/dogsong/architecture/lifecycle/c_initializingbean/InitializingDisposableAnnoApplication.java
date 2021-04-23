package com.dogsong.architecture.lifecycle.c_initializingbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/23.
 */
public class InitializingDisposableAnnoApplication {

    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");

        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.dogsong.architecture.lifecycle.c_initializingbean.bean");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ThirdCOnfiguration.class);

        System.out.println("IOC容器初始化完成。。。");
        System.out.println();
        System.out.println("准备销毁IOC容器。。。");

        ctx.close();
        System.out.println("IOC容器销毁完成。。。");
    }

}
