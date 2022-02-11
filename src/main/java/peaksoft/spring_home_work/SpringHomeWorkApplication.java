package peaksoft.spring_home_work;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHomeWorkApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person myPerson = context.getBean("myPerson", Person.class);
        System.out.println(myPerson);
        context.close();
    }

}