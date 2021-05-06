package com.jpa.base.controller;

import com.jpa.base.entity.User;
import com.jpa.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class HelloContorller {

    @Autowired
    private UserService userService;



    @GetMapping("/hello")
    public List<User> hello(){
        return userService.readAllUser();
    }


}
