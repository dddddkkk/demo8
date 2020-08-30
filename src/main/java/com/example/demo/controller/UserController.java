package com.example.demo.controller;


import com.example.demo.entity.SwiperPO;
import com.example.demo.entity.User;
import com.example.demo.entity.resp;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;
    @RequestMapping("add")
    public String t()
    {
        int id=1;
        User user=userMapper.get(id);
        return user.toString();
    }
    @RequestMapping("query")
    public List<SwiperPO> query(){
       return userService.getSwiperPO();
    }
}
