package com.websitegood.main.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class loginPage {
    @GetMapping("/login")
    public String count() {
        return "login";
    }
}
