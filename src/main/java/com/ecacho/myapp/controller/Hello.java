package com.ecacho.myapp.controller;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Hello {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}