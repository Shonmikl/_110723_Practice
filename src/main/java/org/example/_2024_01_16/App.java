package org.example._2024_01_16;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


//        Cat cat = context.getBean("cat", Cat.class);
//        Person person = context.getBean("person", Person.class);
//        System.out.println(person.getPet());

        TBean tBean = context.getBean("bean", TBean.class);
        System.out.println(tBean);
        System.out.println(tBean.getCat());
        System.out.println(tBean.getPerson());
        System.out.println(tBean.getPerson().getPet());

        context.close();
    }
}
