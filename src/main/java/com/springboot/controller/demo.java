package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class demo {
    @GetMapping
    public  String f()
    {

        System.out.printf("spring boot is running");
        return  "spring boot is running";

    }



}
