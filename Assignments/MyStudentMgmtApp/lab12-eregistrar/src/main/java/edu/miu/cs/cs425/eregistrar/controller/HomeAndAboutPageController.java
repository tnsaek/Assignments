package edu.miu.cs.cs425.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeAndAboutPageController {

    @GetMapping(value={"/home", "/"})
    public String displayHomePage(){
        return "public/home";
    }

    @GetMapping(value = "/about")
    public String displayAboutUsPage(){
        return "public/about";
    }

    @GetMapping(value = "/login")
    public String displayLoginPage(){
        return "public/login";
    }
}
