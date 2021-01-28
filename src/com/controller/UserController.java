package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xhz
 * @description 用户模块控制器
 * @date 2021-01-20
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    //    前端传参acc,pwd    返回一个boolean参数 result   ajax提交
//    登陆验证
    @RequestMapping(value = "/login")
    @ResponseBody
    public boolean login(@RequestBody User user) {
        return userService.checkLogin(user);
    }

    //      前端传参为user对象的所有信息
//    注册入库
    @RequestMapping(value = "/register")
    @ResponseBody
    public boolean register(@RequestBody User user) {
        return userService.register(user);
    }


    //  用户查看信息
    @RequestMapping(value = "/userCheckInfo")
    @ResponseBody
    public User userCheckInfo(@RequestBody User user) {
        return userService.userCheckInfo(user);

    }

    //    用户修改信息
    @RequestMapping(value = "/userModifyInfo")
    @ResponseBody
    public User userModifyInfo(@RequestBody User user) {
        return userService.modifyInfo(user);
    }

    //  用户修改密码
    @RequestMapping(value = "/modifyPassword")
    @ResponseBody
    public boolean modifyPassword(@RequestBody User user) {
        return userService.modifyPwd(user);
    }

    //    忘记密码
    @RequestMapping(value = "/forgetPassword")
    @ResponseBody
    public boolean forgetPassword(@RequestBody User user) {
        return userService.forgetPwd(user);
    }
}
