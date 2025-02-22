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
@RequestMapping("/hello")
public class GetHello {

    // sayHello method that gets data from /:port/hello/{firstName}?{lastName}
    @PutMapping("/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " From BridgeLabz!!";
    }

    //route to test this => http://localhost:8080/hello/Aayush?lastName=Kumar
}
