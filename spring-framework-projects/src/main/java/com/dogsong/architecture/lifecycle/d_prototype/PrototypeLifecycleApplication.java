package com.dogsong.architecture.lifecycle.d_prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/23.
 */
public class PrototypeLifecycleApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PrototypeLifecycleConfiguration.class);
        System.out.println("IOC容器初始化完成。。。");

        Pen pen = ctx.getBean(Pen.class);

        System.out.println("已经取到了Pen。。。");

        System.out.println();
        System.out.println("用完Pen了，准备销毁。。。");
        ctx.getBeanFactory().destroyBean(pen);

        System.out.println("Pen销毁完成。。。");

    }

}
