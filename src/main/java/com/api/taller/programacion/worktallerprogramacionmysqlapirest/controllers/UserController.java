package com.api.taller.programacion.worktallerprogramacionmysqlapirest.controllers;

import com.api.taller.programacion.worktallerprogramacionmysqlapirest.model.UserModel;
import com.api.taller.programacion.worktallerprogramacionmysqlapirest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<UserModel> getUsers() {
        return userService.getUsers();
    }

    @GetMapping
    public Optional<UserModel> getUserById(@RequestBody UserModel user) {
        return userService.getUserById(user);
    }

    @PostMapping("/register")
    public void insertUser(@RequestBody UserModel user) {
       userService.insertUser(user);
    }

    @DeleteMapping
    public void deleteUserById(@RequestBody UserModel user) {
        userService.deleteUserById(user);
    }
}
