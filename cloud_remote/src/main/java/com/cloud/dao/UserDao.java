package com.cloud.dao;

import com.cloud.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public User findByUserName(String user_name);//按用户名查找
    public String login(String user_name,String pwd);//登录
    public String register();//用户注销
    public String findAll();//查找所有用户信息
    public String updateInfo(User User);//修改信息
    public String addUser(User user);//添加用户
    public String deleteInfo(User user);//删除用户信息
}
