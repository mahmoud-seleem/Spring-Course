package test.services;

import test.interfaces.Coach;
import test.interfaces.Service;

public class FootballCoach implements Coach {

    private Service fortuneService;
    private String name;
    public FootballCoach(){

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

    @Override
    public String shutdown() {
        System.out.println("Bean is going out of spring scope !!");
        return "shutting down";
    }

    public String callService(){
        return fortuneService.getService();
    }
}
