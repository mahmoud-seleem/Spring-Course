package test.services;

import test.interfaces.Coach;
import test.interfaces.Service;

public class FootballCoach implements Coach {

    private Service fortuneService;

    public FootballCoach(Service fortuneService){
        this.fortuneService = fortuneService;
    }
    public String callService(){
        return fortuneService.getService();
    }
}
