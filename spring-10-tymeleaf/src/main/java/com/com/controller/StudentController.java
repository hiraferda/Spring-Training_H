package com.com.controller;

import com.com.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }
    @RequestMapping(value = "/welcome",method = RequestMethod.POST) //localhost:8080/student/welcome?name=Ozzy
    @PostMapping("/welcome")
    public String welcome(@RequestParam String name){
        return "student/welcome";
    }
}