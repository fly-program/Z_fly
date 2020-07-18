package com.cloud.test;

import com.cloud.dao.UserDao;
import com.cloud.entity.User;
import com.cloud.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {
    @Autowired
    private static UserServiceImpl s;

    public static void main(String[] args) {
        User byUserName = s.findByUserName("3");
        System.out.println(byUserName);

    }
}
