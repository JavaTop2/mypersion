package com.example.mybatis.demo.service.impl;

import com.example.mybatis.demo.domian.User;
import com.example.mybatis.demo.mapper.UserMapper;
import com.example.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UserMapper userMapper;


    @Override
    public User findByUid(Integer id) {
        return userMapper.findByUid(id);
    }
}
