package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/")
    public String getRoot() {
        return "Hello World from Galaxy Cloud!";
    }

    @GetMapping("/get")
    public String getMe(){
        return "You got me Hello World!";
    }

}
