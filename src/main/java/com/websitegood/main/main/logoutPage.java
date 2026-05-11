package com.websitegood.main.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logoutPage {
    @GetMapping("/logout")
    public String count() {
        return "This is the logout page!";
    }
}
