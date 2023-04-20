package com.isthifa.multithreading.rest;

import com.isthifa.multithreading.entity.User;
import com.isthifa.multithreading.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class usercontroller {
    @Autowired
    private userService userservice;
    @PostMapping("/save")
    public ResponseEntity<User> add(@RequestBody User user) throws InterruptedException {
        User create=userservice.save(user);
        System.out.println(" "+Thread.currentThread().getName());
        userservice.findall();
        userservice.findbyid(1);
        return new ResponseEntity<User>(create, HttpStatus.CREATED);
    }
}
