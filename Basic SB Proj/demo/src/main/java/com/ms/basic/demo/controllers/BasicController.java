package com.ms.basic.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BasicController
 */
@RestController
@RequestMapping("/test")
public class BasicController {
    @GetMapping()
    public String getMessage(){
        return "This message is coming from get message method.";
    }
    
}