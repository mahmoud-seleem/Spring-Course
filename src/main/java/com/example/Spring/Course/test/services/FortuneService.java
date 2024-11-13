package com.example.Spring.Course.test.services;

import org.springframework.stereotype.Component;
import com.example.Spring.Course.test.interfaces.Service;

@Component()
public class FortuneService implements Service
{
    @Override
    public String getService(){
        return "my awesome service";
    }
}
