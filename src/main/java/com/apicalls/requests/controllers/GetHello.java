package com.apicalls.requests.controllers;

import org.springframework.web.bind.annotation.*;

@RestController // denotes this class as a controller
public class GetHello {

    // sayHello method that sends gets data from /:port/hello
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false) String name) {
        return "Hello " + name + " From BridgeLabz!!";
    }

    //route to test this => http://localhost:8080/hello?name=Aayush
}
