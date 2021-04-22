package com.dogsong.architecture.basic_di.bean.c_instantiate;

import com.dogsong.architecture.basic_di.bean.c_instantiate.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/22.
 */
public class BeanInstantiateXmlApplication {


    public static void main(String[] args) {
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_di/bean/c_instantiate/bean-instantiate.xml");
        //
        // ctx.getBeansOfType(Car.class).forEach((beanName, car) -> {
        //     System.out.println(beanName + " : " + car);
        // });

        // 尝试取一下试试
        // 静态工厂本身不会被注册到 IOC 容器中
        // System.out.println(ctx.getBean(CarStaticFactory.class));


        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        ctx2.getBeansOfType(Car.class).forEach((beanName, car) -> {
            System.out.println(beanName + " : " + car);
        });
    }

}
