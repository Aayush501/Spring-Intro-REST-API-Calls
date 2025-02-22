package com.apicalls.requests.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHello {

    @GetMapping("/")
    public String sayHello() {
        return "Hello from BridgeLabz!!!";
    }
}
