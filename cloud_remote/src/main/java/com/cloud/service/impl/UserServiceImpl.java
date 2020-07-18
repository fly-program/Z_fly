package com.cloud.service.impl;

import com.cloud.dao.UserDao;
import com.cloud.entity.User;
import com.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User findByUserName(String user_name) {
        System.out.println("11111111"+user_name);
        return userDao.findByUserName(user_name);
    }

    @Override
    public String login(String user_name, String pwd) {
        return null;
    }

    @Override
    public String register() {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public String updateInfo(User User) {
        return null;
    }

    @Override
    public String addUser(User user) {
        return null;
    }

    @Override
    public String deleteInfo(User user) {
        return null;
    }
}
