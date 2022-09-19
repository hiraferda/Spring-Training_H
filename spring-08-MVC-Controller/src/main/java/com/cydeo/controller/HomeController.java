package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){ //which end point? www.amazon.com/login
        return "home.html";
    }

    @RequestMapping //nothing and /
    public String home2() { //which end point? www.amazon.com/login
        return "home.html";
    }

    @RequestMapping({"/apple", "orange"})
    public String home3() {
        return "home.html";
    }
}
