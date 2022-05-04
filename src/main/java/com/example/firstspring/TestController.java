package com.example.firstspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private int count = 0;


    @RequestMapping("/count")
    public String count(){
        count++;
        return "Count: " + count;
    }

    @RequestMapping("/")
    public String hello(){
        return "Hello world!";
    }

    @RequestMapping("/at")
    public String hallo(){
        return "Hallo Welt!";
    }
}

