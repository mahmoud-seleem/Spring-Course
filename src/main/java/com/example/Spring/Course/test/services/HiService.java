package com.example.Spring.Course.test.services;

import com.example.Spring.Course.test.interfaces.Service;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class HiService implements Service {
    @Override
    public String getService() {
        return "Hi from Hi service";
    }
}
