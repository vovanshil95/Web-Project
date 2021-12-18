package com.WebProject.controllers;


import com.WebProject.Exceptions.SameCredentialsException;
import com.WebProject.entity.UserEntity;
import com.WebProject.service.ProductService;
import com.WebProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public ResponseEntity login() {
        try {
            return ResponseEntity.ok(userService.getUserByCredentials("vovanshil95@mail.ru", "1234").get().getId());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

}
