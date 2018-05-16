package com.example.mybatis.demo.controller;

import com.example.mybatis.demo.domian.User;
import com.example.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("findByUid")
    public User findByUid(Integer id){
        return userService.findByUid(id);
    }
}
