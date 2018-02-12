package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/user/hello")
    public String helloUser(@RequestBody String name) {
        return "Hello " + name;
    }
}
