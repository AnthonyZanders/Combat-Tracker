package com.backend.combattracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingHello {
    @GetMapping("/hello")
    public String hello(){
        return "Our combat tracking application is running!";
    }
}
