package com.example.mybatis.demo.service;

import com.example.mybatis.demo.domian.User;

public interface UserService {

    User findByUid(Integer id);
}
