package com.dao;

import com.pojo.Question;
import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *功能描述:<br>
 *<试卷模块访问数据库的接口>
 *@Param:
 *@Return:
 *@Author:WBW
 *@Date:2021/1/21 11:12
 */

@Mapper
public interface TestPaperDao {
    List<Question> selectAllQuestion(User user);
}
