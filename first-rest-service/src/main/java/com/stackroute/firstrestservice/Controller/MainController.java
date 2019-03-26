package com.stackroute.firstrestservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/firstService")
    public String sayHello() {
        return "Hello World From The First Service!!";
    }
}
