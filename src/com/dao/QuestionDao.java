package com.dao;


import com.pojo.Question;
import com.pojo.QuestionType;
import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 *功能描述:<br>
 *<试题接口>
 *@Param:
 *@Return:
 *@Author:WBW
 *@Date:2021/1/21 14:51
 */

@Mapper
public interface QuestionDao {
//查询所有科目类型
    List<String> queryAllQuestionType(User user);
//新建科目类型
    int newSubjectType(QuestionType questionType);
//    删除科目类型
    int deleteSubjectType(QuestionType questionType);
//    是否有重复的科目类型
    List<QuestionType> whetherRepeat(QuestionType questionType);
//    新建题目
    int createNewQuestion(Question question);
//    修改题目
    int modifyQuestionContent(Question question);
//    删除题目
    int deleteQuestion(Question question);
}
