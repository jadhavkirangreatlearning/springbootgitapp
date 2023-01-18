package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public String sayHello(){
        return "WELCOME TO FINTECH CSI PUNE";
    }

    @GetMapping("/address")
    public String sayAddress(){
        return "PUNE MH INDIA";
    }

    @GetMapping("/services")
    public String sayServices(){
        return "Software Developement";
    }

    @GetMapping("/loan")
    public String loanEligibility(){
        return "Yes Eligible";
    }
}
