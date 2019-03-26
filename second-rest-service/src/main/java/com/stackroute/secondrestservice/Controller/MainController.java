package com.stackroute.secondrestservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/secondService")
    public String sayHello(){
        return "Hello World From Second  Controller";
    }
}
