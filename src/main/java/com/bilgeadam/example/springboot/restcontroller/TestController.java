package com.bilgeadam.example.springboot.restcontroller;

import com.bilgeadam.example.springboot.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {


    @GetMapping("/test")
    public String test(){
        return "Hello Spring Rest";
    }

    @GetMapping("/userTest")
    public User userTest(){

        User user=new User();
        user.setUserName("Ramazan");
        user.setPassword("1234");
        user.setYear(1991);
        user.setSalery(2000.500);
        user.setBirthDate(new Date());

        return user;
    }

}
