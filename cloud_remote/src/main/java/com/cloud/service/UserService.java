package com.cloud.service;

import com.cloud.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User findByUserName(String user_name);//按用户名查找
    public String login(String user_name,String pwd);//登录
    public String register();//用户注销
    public List<User> findAll();//查找所有用户信息
    public String updateInfo(User User);//修改信息
    public String addUser(User user);//添加用户
    public String deleteInfo(User user);//删除用户信息

}
