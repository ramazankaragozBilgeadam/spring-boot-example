package com.bilgeadam.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HomeController {


    //@RequestMapping(value = "/home",method = RequestMethod.GET)
    @GetMapping("/home")
    public String home(Model model){

        model.addAttribute("serverDate",new Date());
        return "home";
    }

}
