package com.cs6650.helloservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j  // Lombok annotation for logging
@RestController  // Combines @Controller and @ResponseBody
@RequestMapping("/hello")  // Base path for all endpoints in this controller
public class HelloController {

    @GetMapping  // Maps HTTP GET requests to /hello
    public ResponseEntity<String> sayHello() {
        log.info("Hello endpoint called");
        return ResponseEntity.ok("Hello, World!");
    }

    // Bonus: Add a personalized greeting
    @GetMapping("/{name}")
    public ResponseEntity<String> sayHelloToName(@PathVariable String name) {
        log.info("Personalized hello called for: {}", name);
        return ResponseEntity.ok(String.format("Hello, %s!", name));
    }
}
