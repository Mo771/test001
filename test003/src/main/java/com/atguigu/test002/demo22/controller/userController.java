package com.atguigu.test002.demo22.controller;

import com.atguigu.test002.demo22.bean.userInfo;

import com.atguigu.test002.demo22.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    @Autowired
    private userService userService;


    @RequestMapping("getALllist")
    public List<userInfo> getAllUser(){
        return userService.getALLuser();
    };

    @RequestMapping("addUser")
    public  void  addUser(userInfo  user){
        userService.addUser(user);
    };


    @RequestMapping("updataUser")
    public  String  updataUser(userInfo user){
        user.setLoginName("小猪佩奇");
        user.setId("4");
        userService.updataUser(user);
        return "ok";
    }


    @RequestMapping("delUser")
    public  void  delUser(userInfo user){
        userService.delUser(user);
    }

}
