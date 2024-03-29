package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @RequestMapping("/info")
    public String carInfo(@RequestParam String make){
        System.out.println(make);
        return "/car/car";
    }

    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value = "make",required = false,defaultValue = "KIA") String make, Model model){

        model.addAttribute("make",make);

        return "car/car-info";
    }

}
