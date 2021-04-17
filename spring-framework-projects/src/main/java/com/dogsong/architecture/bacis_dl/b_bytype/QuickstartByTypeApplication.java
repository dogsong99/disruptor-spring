package com.dogsong.architecture.bacis_dl.b_bytype;



import com.dogsong.architecture.bacis_dl.b_bytype.bean.Person;
import com.dogsong.architecture.bacis_dl.b_bytype.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author domisong.
 * @description: 一个最基本的 IOC 依赖查找实例
 *                      根据类型查找-byType
 * @date 2021/4/17.
 */
public class QuickstartByTypeApplication {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");

        Person person = factory.getBean(Person.class);


        System.out.println(person.toString());


        DemoDao demoDao = factory.getBean(DemoDao.class);

        System.out.println(demoDao.findAll());

    }

}
