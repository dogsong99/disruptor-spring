package com.dogsong.architecture.bacis_dl.a_quickstart_byname;


import com.dogsong.architecture.bacis_dl.a_quickstart_byname.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author domisong.
 * @description:  一个最基本的 IOC 依赖查找实例
 * @date 2021/4/17.
 */
public class QuickstartByNameApplication {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");

        Person person = (Person) factory.getBean("person");

        person.setName("ABC");
        person.setAge(22);

        System.out.println(person.toString());

    }

}
