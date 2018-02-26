package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class DemoController {

    @Value("${savedUser}")
    private String user;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/user/hello")
    public String helloUser(@RequestBody String name) {
        return "Hello " + name;
    }

    @GetMapping("/savedUser/hello")
    public String helloSavedUser() {
        return "Hello " + user;
    }
}
