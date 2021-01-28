package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import com.util.DateFormatUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @author xhz
 * @description 业务接口实现类
 * @date 2021-01-20
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
//    查找数据库是否有该对象
    public boolean checkLogin(User user) {
        User dbUser = userDao.queryUser(user);
        return dbUser != null;
    }

    //    注册入库
    @Override
    public boolean register(User user) {
        Date date = new Date();
//        设置三个固定属性
        user.setId(UUID.randomUUID().toString());
        user.setCreatetime(DateFormatUtil.date2String(date));
        user.setIsdelete(0);
        int i;
//        验证数据库是否有该内容
        User isExitUser = userDao.queryUser(user);
        if (isExitUser != null) {
            return false;
        } else {
            if (user.getAcc() != null) {
                i = userDao.registerUser(user);
                return i != 0;
            } else {
                return false;
            }
        }


    }

    //  用户查看信息
    @Override
    public User userCheckInfo(User user) {
        return userDao.CheckInfo(user);
    }

    //修改用户信息
    @Override
    public User modifyInfo(User user) {
        int i = userDao.modifyInfo(user);
        User user1 = null;
        if (i != 0) {
            user1 = userDao.modifyInfoSelect(user);
        }
        return user1;
    }

    //用户修改密码
    @Override
    public boolean modifyPwd(User user) {
        int i = userDao.modifyPwd(user);
        return i != 0;
    }

    //      忘记密码
    @Override
    public boolean forgetPwd(User user) {
        User user1 = userDao.forgetSelectUser(user);
        boolean mark;
        mark = user1 != null;
        return mark;
    }


}
