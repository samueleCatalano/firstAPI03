package com.firstAPI03.firstAPI03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping
    public String concat(String first, @RequestParam(required = false) String second) {
        first = "Hello ";
        second = "Elliot";
        if(second == null) {
            second = first;
        }
        return first + second;
    }
}