package com.example.jwtsecurity.controller;

import com.example.jwtsecurity.user.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public User get(HttpServletRequest request) {
        System.out.println(request.getSession().getId());
        System.out.println(request.getSession().isNew());
        return new User("alex");
    }

}
