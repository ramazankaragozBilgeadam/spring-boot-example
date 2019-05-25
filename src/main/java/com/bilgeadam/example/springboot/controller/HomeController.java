package com.bilgeadam.example.springboot.controller;

import com.bilgeadam.example.springboot.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/homeParameter")
    public String homeParameter(@RequestParam(value = "userName",defaultValue = "USER") String username,Model model){

        model.addAttribute("userParameterName",username);
        return "homeParameter";
    }

    @GetMapping(value = "/homeParameterPassword")
    public String homeMultiParameter(@RequestParam(value = "userName",defaultValue = "USER")String username
            ,@RequestParam(value = "password",defaultValue = "***") String password,Model model){

        model.addAttribute("userParameterName",username);
        model.addAttribute("userPassword",password);

        return "homeParameter";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/user")
    public String user(User user,Model model){

        model.addAttribute("userName",user.getUserName());
        model.addAttribute("password",user.getPassword());

        return "user";
    }




}
