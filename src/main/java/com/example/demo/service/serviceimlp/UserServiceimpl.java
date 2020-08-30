package com.example.demo.service.serviceimlp;

import com.example.demo.entity.SwiperPO;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {

    @Autowired
   UserMapper userMapper;
    @Override   
    public PageInfo<User> getall(int a, int b) {
        PageHelper.startPage(a,b);
        List<User> users =userMapper.getall();
        PageInfo<User> pageInfo =new PageInfo<>(users);
        return pageInfo;

    }

    @Override
    public List<SwiperPO> getSwiperPO() {
        return userMapper.query();
    }
}
