package com.atguigu.test002.demo22.Impl;

import com.atguigu.test002.demo22.bean.userInfo;
import com.atguigu.test002.demo22.mapper.uerInfoMapper;
import com.atguigu.test002.demo22.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class userServiceimpl implements userService {


    @Autowired
    private uerInfoMapper uerInfoMapper;

    @Override
    public List<userInfo> getALLuser() {
        return uerInfoMapper.selectAll();
    }

    @Override
    public void addUser(userInfo user ) {
        user.setId("4");
        user.setEmail("atguigu.com");
        user.setLoginName("小猪");
         uerInfoMapper.insertSelective(user);
    }

    @Override
    public void updataUser(userInfo user) {
        uerInfoMapper.updateByPrimaryKey(user);
    }

    @Override
    public void delUser(userInfo user) {
        uerInfoMapper.delete(user);
    }
}
