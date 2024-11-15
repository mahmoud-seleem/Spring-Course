package com.example.Spring.Course.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {

    @RequestMapping("/")
    public String myMethod(){
        return "hello";
    }
}
