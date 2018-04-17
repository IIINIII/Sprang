package com.ibrokhim.sprang.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @GetMapping("")
    public String index() {
        return "Welcome to Sprang!";
    }

}
