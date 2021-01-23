package com.example.juniorprogrammer.cicdtomcat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping(value = "test")
    public String check(){
        return "masuk pak eko";
    }

}
