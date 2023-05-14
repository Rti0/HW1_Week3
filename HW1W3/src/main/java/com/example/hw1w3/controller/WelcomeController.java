package com.example.hw1w3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/welcome")
public class WelcomeController {
    @GetMapping( "/name")
    public String name(){
        return "My name is Reem";
    }
    @GetMapping("/age")
   public String age(){
        return "My age is 25";
   }
@GetMapping("/check/status")

   public String checkStatus(){
        return "Everything OK";
   }
   @GetMapping("/health")

   public String health(){
        return "Server health is up and running";
   }
}
