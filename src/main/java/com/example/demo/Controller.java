package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("registration")
@RestController
public class Controller {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public String createUser(@RequestBody UserEntity userEntity){
        this.repository.save(userEntity);
        return "User Created Successfully 1.1";
    }
}
