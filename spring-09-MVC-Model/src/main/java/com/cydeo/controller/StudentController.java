package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        //method model interface
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");
        String subject = "Spring Boot";
        model.addAttribute("subject", subject);

        int studentId = new Random().nextInt();
        model.addAttribute("id", studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        model.addAttribute("numbers", numbers);

        LocalDate dt = LocalDate.now();
        model.addAttribute("date",dt);

        return "student/welcome";
    }
}