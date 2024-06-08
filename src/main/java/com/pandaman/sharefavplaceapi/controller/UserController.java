package com.pandaman.sharefavplaceapi.controller;

import com.pandaman.sharefavplaceapi.entity.User;
import com.pandaman.sharefavplaceapi.service.UserService;
import com.pandaman.sharefavplaceapi.service.UserServiceImpl;

import dto.CreateDTO;
import java.util.List;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

     @RequestMapping(value="/users",method = {RequestMethod.GET})
     public List<User> getUsers() {
         return userService.findAll();
     }

    @RequestMapping(value="/new",method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<User> userTest(@RequestBody List<User> users) {
         users.forEach(user -> System.out.println("Received user: " + user));
         
         return userService.saveAll(users);
    }
}
