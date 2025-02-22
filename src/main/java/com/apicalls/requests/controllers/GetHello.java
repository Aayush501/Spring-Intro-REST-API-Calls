package com.apicalls.requests.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHello {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello from BridgeLabz!!!";
    }
}
