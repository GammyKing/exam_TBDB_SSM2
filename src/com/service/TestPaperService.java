package com.service;

import com.pojo.Question;
import com.pojo.User;

import java.util.List;

/**
 *功能描述:<br>
 *<试卷接口>
 *@Param:
 *@Return:
 *@Author:WBW
 *@Date:2021/1/21 11:11
 */
public interface TestPaperService {
//查询所有存在的科目类型
     List<Question> selectAllQuestion(User user);

}
