package com.example.springjwt.controller;

import com.example.springjwt.model.User;
import com.example.springjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void postUser(@RequestBody User user){
        userService.creatUser(user);
    }

}
