package com.EnvironmentsVariables01.demoEnvironmentsVariables01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping
@RestController
public class Controller{

    @Value("${custom.authCode}")
    private String authCode;

    @Value("${custom.devName}")
    private String devName;

    @GetMapping("/")
    public String greeting() {
        return "Hello, " + devName + "! Your auth code is: " + authCode;
    }
}