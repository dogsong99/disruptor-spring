package com.dogsong.architecture.basic_di.d_complexfield;

import com.dogsong.architecture.basic_di.d_complexfield.bean.Cat;
import com.dogsong.architecture.basic_di.d_complexfield.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
public class InjectComplexFieldAnnoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.dogsong.architecture.basic_di.d_complexfield.bean");
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);

        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);
        Cat cat = ctx2.getBean(Cat.class);
        System.out.println(cat);

        Dog dog1 = ctx2.getBean(Dog.class);
        System.out.println(dog1);
    }


}
