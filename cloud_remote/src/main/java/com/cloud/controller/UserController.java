package com.cloud.controller;

import com.cloud.entity.User;
import com.cloud.service.UserService;
import com.cloud.service.impl.UserServiceImpl;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    /* 用户登录判断用户是否存在，存在便登录，不存在重新登录*/
    @RequestMapping(value="/login")
    public String login(String user_name,String pwd){

        return "success";
    }

    /*按用户名查找用户*/
    @RequestMapping(value="/byUsername")
    public String findUser(String user_name,Model model){
        User user=userService.findByUserName(user_name);
        model.addAttribute("user",user);
        return "success";
    }
    /*用户注册时校验用户是否已经存在，信息是否符合要求*/
    @RequestMapping(value="/register")
    public String register(){

        return "sucess";
    }
    /*显示所有用户*/
    @RequestMapping(value="/findAll")
    public String findAll() {
        return "sucess";
    }

    /*修改用户信息*/
    @RequestMapping(value="/updateInfo")
    public String updateInfo(User User) {
        return "sucess";
    }
    /*添加用户*/
    @RequestMapping(value="/addUser")
    public String addUser(User user) {
        return "sucess";
    }
    /*删除用户*/
    @RequestMapping(value="/deleteInfo")
    public String deleteInfo(User user) {
        return "sucess";
    }

}
