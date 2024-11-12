package com.example.Spring.Course.test.services;

import com.example.Spring.Course.test.interfaces.Service;

@org.springframework.stereotype.Service
public class HiService implements Service {
    @Override
    public String getService() {
        return "Hi from Hi service";
    }
}
