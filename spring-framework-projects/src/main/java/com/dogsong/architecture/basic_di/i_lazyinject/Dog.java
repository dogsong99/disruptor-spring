package com.dogsong.architecture.basic_di.i_lazyinject;

import com.dogsong.architecture.basic_di.bean.Person;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
@Component
public class Dog {


    private Person person;

    /**
     *  setter 注入, 注入时机是创建对象后
     */
    @Autowired
    public void setPerson(ObjectProvider<Person> person) {
        // 有Bean才取出，注入
        this.person = person.getIfAvailable();
    }

    /**
     *  构造器 注入, 注入时机是创建对象时
     */
    public Dog(ObjectProvider<Person> person) {
        // 如果没有Bean，则采用缺省策略创建
        this.person = person.getIfAvailable(Person::new);
    }

}
