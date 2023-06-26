package com.greeting.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HalloworldController {

    @GetMapping("/hello")
    public Time Greet() {
        return new Time(LocalDateTime.now(), "HelloWorld!");
    }

}

