package com.apicalls.requests.controllers;

import org.springframework.web.bind.annotation.*;

// created class HelloName
class HelloName {
    // attributes of this class
    String firstName;
    String lastName;

    HelloName() {
        firstName = "Aayush";
        lastName = "Kumar";
    }

    // getters method
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}

@RestController
public class GetHello {

    // sayHello method that gets data from /:port/hello
    @PostMapping("/hello")
    public String sayHello(@RequestBody HelloName hello) {
        return "Hello " + hello.getFirstName() + " " + hello.getLastName() + " From BridgeLabz!!";
    }

    /*
        route to test this => http://localhost:8080/hello in postman with below raw body :
        {
            "firstName" : "Aayush",
            "lastName" : "Kumar"
        }
    */
}
