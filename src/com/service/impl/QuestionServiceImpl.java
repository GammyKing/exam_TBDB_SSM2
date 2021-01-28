package com.service.impl;

import com.dao.QuestionDao;
import com.pojo.Question;
import com.pojo.QuestionType;
import com.pojo.User;
import com.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

import static com.util.DateFormatUtil.date2String;

/**
 * 功能描述:<br>
 * <试题模块有关试题类型及试题的增删改查>
 *
 * @Param:
 * @Return:
 * @Author:WBW
 * @Date:2021/1/21 14:53
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionDao questionDao;

    //    查询所有已存在的科目类型在service层的具体实现
    @Override
    public List<String> queryAllQuestionType(User user) {
        List<String> strings = questionDao.queryAllQuestionType(user);
        return strings;
    }

    //    新建科目类型在service层的具体实现
    @Override
    public boolean newSubjectType(QuestionType questionType) {
        boolean mark = false;
        int i = questionDao.newSubjectType(questionType);
        if (i > 0) {
            mark = true;
        }
        return mark;
    }

    //    删除科目类型在Service层的具体实现
    @Override
    public boolean deleteSubjectType(QuestionType questionType) {
        boolean mark = false;
        int i = questionDao.deleteSubjectType(questionType);
        System.out.println("Service:"+i);
        if (i > 0) {
            mark = true;
        }
        return mark;
    }

    //    查询是否有重复的科目类型
    @Override
    public boolean whetherRepeat(QuestionType questionType) {
        Date date = new Date();
        questionType.setId(UUID.randomUUID().toString());
        questionType.setCreatetime(date2String(date));
        boolean mark = true;
        List<QuestionType> questionTypes = questionDao.whetherRepeat(questionType);
        if (questionTypes.size() != 0) {
            mark = false;
        }
        return mark;
    }

    //    新建题目
    @Override
    public boolean createNewQuestion(Question question) {
        System.out.println("Service:"+question);
        boolean mark = false;
        Date date = new Date();
        question.setCreatetime(date2String(date));
        question.setId(UUID.randomUUID().toString());
        int i = questionDao.createNewQuestion(question);
        if (i > 0) {
            mark = true;
        }
        return mark;
    }

    //    修改题目
    @Override
    public boolean modifyQuestionContent(Question question) {
        boolean result = false;
        int i = questionDao.modifyQuestionContent(question);
        if (i > 0) {
            result = true;
        }
        return result;
    }

    //    删除题目
    @Override
    public boolean deleteQuestion(Question question) {
        boolean result = false;
        int i = questionDao.deleteQuestion(question);
        if (i > 0) {
            result = true;
        }
        return result;
    }


}
