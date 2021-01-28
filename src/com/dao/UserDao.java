package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xhz
 * @description 用户数据库交互
 * @date 2021-01-20
 */
@Mapper
public interface UserDao {
    User queryUser(User user);

    int registerUser(User user);

    User CheckInfo(User user);

    int modifyInfo(User user);

    User modifyInfoSelect(User user);

    int modifyPwd(User user);

    User forgetSelectUser(User user);
}
