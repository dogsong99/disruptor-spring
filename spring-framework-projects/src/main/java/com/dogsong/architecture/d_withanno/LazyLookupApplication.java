package com.dogsong.architecture.d_withanno;

import com.dogsong.architecture.d_withanno.bean.Cat;
import com.dogsong.architecture.d_withanno.bean.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/17.
 */
public class LazyLookupApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        // 下面的代码会报Bean没有定义 NoSuchBeanDefinitionException
        // Dog dog = ctx.getBean(Dog.class);

        // 这一行代码不会报错
        ObjectProvider<Dog> dogProvider = ctx.getBeanProvider(Dog.class);

        // 找不到 Bean 时返回 null 而不抛出异常
        Dog dog = dogProvider.getIfAvailable();
        if (dog == null) {
            dog = new Dog();
        }

        // 或者这样写
        Dog dog2 = dogProvider.getIfAvailable(() -> new Dog());

        // 或者
        Dog dog3 = dogProvider.getIfAvailable(Dog::new);

    }

}
