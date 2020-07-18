package com.cloud.dao;

import com.cloud.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User findByUserName(String user_name);//按用户名查找

    String login(String user_name, String pwd);//登录

    String register();//用户注销

    String findAll();//查找所有用户信息

    String updateInfo(User User);//修改信息

    String addUser(User user);//添加用户

    String deleteInfo(User user);//删除用户信息
}
