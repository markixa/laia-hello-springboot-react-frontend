package com.ironhack.springreactcruddemo.controller;

import com.ironhack.springreactcruddemo.model.User;
import com.ironhack.springreactcruddemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    List<User> getAllusers(){
        return userRepository.findAll();
    }

    @PatchMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

}
