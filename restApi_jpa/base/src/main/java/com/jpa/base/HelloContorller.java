package com.jpa.base;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloContorller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
