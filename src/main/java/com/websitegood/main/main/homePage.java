package com.websitegood.main.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homePage{

    @GetMapping("/home")
    public String count() {

        return "<p> Welcome to website SuperGood<p>";
    }
}