package com.apicalls.requests.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class GetHello {

    // sayHello method that gets data from /:port/hello
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false) String name) {
        return "Hello " + name + " From BridgeLabz!!";
    }

    //route to test this => http://localhost:8080/hello?name=Aayush
}
