package br.com.gabrielmirandasilv.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @GetMapping("/login")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String login() {
        return "login";
    }
    
}
