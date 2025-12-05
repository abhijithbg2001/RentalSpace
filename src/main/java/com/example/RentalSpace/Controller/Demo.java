package com.example.RentalSpace.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Demo {
   @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
    @GetMapping("/home")
    public String home(){
       return "Welcome to home";
    }
}
