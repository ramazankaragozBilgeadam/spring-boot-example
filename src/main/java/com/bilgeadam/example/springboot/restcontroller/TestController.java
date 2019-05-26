package com.bilgeadam.example.springboot.restcontroller;

import com.bilgeadam.example.springboot.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "testController")
public class TestController {

    @GetMapping("test")
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

    @PostMapping("/userKaydet")
    public User userKaydet(@RequestBody User user){
        System.out.println(user);
        System.out.println(user.getUserInfo());
        return user;
    }

}
