package com.codegym.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/international")
    public String getInternationalPage(){
        return "/international";
    }
}
