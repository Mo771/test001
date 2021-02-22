package com.atguigu.test002.demo22.service;

import com.atguigu.test002.demo22.bean.userInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface userService {
    List<userInfo> getALLuser();

    void addUser(userInfo userInfo);

    void updataUser(userInfo userInfo);

    void delUser(userInfo userInfo);
}
