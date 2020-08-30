package com.example.demo.service;

import com.example.demo.entity.SwiperPO;
import com.example.demo.entity.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    PageInfo<User> getall(int a, int b);
    List<SwiperPO> getSwiperPO();


}
