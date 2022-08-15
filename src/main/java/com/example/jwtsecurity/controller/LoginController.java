package com.example.jwtsecurity.controller;

import com.example.jwtsecurity.user.User;
import com.example.jwtsecurity.util.DecodeUtil;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@AllArgsConstructor
public class LoginController {

//    ServiceImpl<User> service;

    @GetMapping
    public String login(@RequestBody LoginDto loginDto) {
        String name = loginDto.getName();
        String password = loginDto.getPassword();
        return DecodeUtil.encode(name) + ";" + DecodeUtil.encode(password);
    }
}
