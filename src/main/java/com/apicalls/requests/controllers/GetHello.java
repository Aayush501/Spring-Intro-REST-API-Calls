package com.apicalls.requests.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class GetHello {

    // sayHello method that gets data from /:port/hello/{name}
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " From BridgeLabz!!";
    }

    //route to test this => http://localhost:8080/hello/Aayush
}
