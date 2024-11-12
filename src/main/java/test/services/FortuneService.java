package test.services;

import test.interfaces.Service;

public class FortuneService implements Service
{
    @Override
    public String getService(){
        return "my awesome service";
    }
}
