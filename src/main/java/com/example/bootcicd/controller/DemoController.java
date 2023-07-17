package com.example.bootcicd.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @GetMapping("/message")
    public String getmessage(){
      return "Creating CI/CD Pipeline using SpringBoot";
    }
  }
