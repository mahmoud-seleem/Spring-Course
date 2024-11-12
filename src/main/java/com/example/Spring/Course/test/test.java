package com.example.Spring.Course.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.Spring.Course.test.interfaces.Coach;
import com.example.Spring.Course.test.interfaces.Service;
import com.example.Spring.Course.test.services.FootballCoach;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = context.getBean("fortuneService",Service.class);
        Coach coach = context.getBean("myCoach",Coach.class);
        System.out.println(service);
        System.out.println(coach.callService());
        System.out.println(service.getService());
        //System.out.println(((FootballCoach)coach).getName());
        context.close();
    }
}
