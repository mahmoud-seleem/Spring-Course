package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.interfaces.Coach;
import test.interfaces.Service;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = context.getBean("myFortuneService", Service.class);
        Coach coach = context.getBean("myCoach",Coach.class);
        System.out.println(coach.callService());
        System.out.println(service.getService());
    }
}
