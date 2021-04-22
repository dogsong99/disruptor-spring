package com.dogsong.architecture.basic_di.bean.b_scope;

import com.dogsong.architecture.basic_di.bean.b_scope.bean.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
public class BeanScopeAnnoApplication {


    public static void main(String[] args) {

        // ApplicationContext ctx = new AnnotationConfigApplicationContext("com.linkedbear.spring.bean.b_scope.bean");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);

        ctx.getBeansOfType(Child.class).forEach((name, child) -> {
            System.out.println(name + " : " + child);
        });
    }

}
