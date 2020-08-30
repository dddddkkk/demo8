package com.example.demo.mapper;

import com.example.demo.entity.SwiperPO;
import com.example.demo.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

     User get(int id);
     List<User> getall();
     List<SwiperPO> query();
}
