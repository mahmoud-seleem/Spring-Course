package com.example.Spring.Course.test.services;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.Spring.Course.test.interfaces.Coach;
import com.example.Spring.Course.test.interfaces.Service;
@Component(value = "myCoach")
public class FootballCoach implements Coach {

    //@Autowired
    private Service fortuneService;
    private String name;
    public FootballCoach(Service fortuneService){
        this.fortuneService = fortuneService;
    }
    public void setFortuneService(Service fortuneService){
        this.fortuneService = fortuneService;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String startup() {
        System.out.println("Bean is initialized now !!");
        return "starting";
    }
    @PostConstruct
    public void Start(){
        System.out.println("starting the Bean after it is initialized" + this.fortuneService);
    }
    @Override
    public String shutdown() {
        System.out.println("Bean is going out of spring scope !!");
        return "shutting down";
    }

    public String callService(){
        return fortuneService.getService();
    }

    public Service getFortuneService() {
        return this.fortuneService;
    }
}
