package com.WebProject.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/")
    public String getTest () {
        try {
            return "index.html";
            //return ResponseEntity.ok(new File("src/main/resources/templates/index.html").exists());
        } catch (Exception e) {
            return "ошибка";
        }
    }
}
