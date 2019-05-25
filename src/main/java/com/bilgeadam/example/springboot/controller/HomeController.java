package com.bilgeadam.example.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

@Controller
public class HomeController {


    @Value(value = "${server.port}")
    private String portInfo;

    //@RequestMapping(value = "/home",method = RequestMethod.GET)
    @GetMapping("/home")
    public String home(Model model){

        model.addAttribute("serverDate",new Date());
        model.addAttribute("portInfo",portInfo);
        return "home";
    }

    @GetMapping("/homePathVariable/{userName}")
    public String homePathVariable(@PathVariable(value = "userName") String userName,Model model){

        model.addAttribute("userNameTest",userName);

        return "homePathVariable";
    }


}
