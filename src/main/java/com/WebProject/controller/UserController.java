package com.WebProject.controller;


import com.WebProject.entity.UserEntity;
import com.WebProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        try {
            return "login";
        } catch (Exception e) {
            return "Произошла ошибка";
        }
    }

    @PostMapping("/check_login")
    public String checkLogin(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password, Model model) {
        try {
            Optional<UserEntity> MBUser = userService.getUserByCredentials(email, password);
            if (MBUser.isEmpty()) {
                model.addAttribute("loginError", true);
                return "login";
            } else {
                return "index";
            }
        } catch (Exception e) {
            return "Произошла ошибка";
        }
    }

}
