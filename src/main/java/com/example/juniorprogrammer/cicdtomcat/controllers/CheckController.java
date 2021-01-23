package com.example.juniorprogrammer.cicdtomcat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping(value = "test")
    public String check(@RequestParam String name){
        return "masuk pak "+name;
    }

}
