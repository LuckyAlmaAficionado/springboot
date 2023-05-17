package com.railway.belajarrailway.controller;

import com.railway.belajarrailway.model.Users;
import com.railway.belajarrailway.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MainController {

    @Autowired
    private UsersService service;

    @GetMapping("/app")
    String sapa() {
        return "hai apakabar.!";
    }

    @GetMapping("/users")
    List<Users> getUsers() {
        return service.getUsers();
    }

    @PostMapping("/register")
    Users registerUser(@RequestBody Users users) {
        return service.register(users);
    }

}
