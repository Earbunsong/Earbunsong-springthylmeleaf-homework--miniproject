package com.example.springthymleafpartone.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
     @GetMapping("/index")
    public ModelAndView getHomePage(){
         ModelAndView obj = new ModelAndView();
         obj.setViewName("index");
         return obj;
     }
     @GetMapping("/register")
    public String registerForm(){
         return "register";
     }
}
