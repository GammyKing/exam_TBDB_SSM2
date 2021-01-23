package com.service.impl;

import com.dao.QuestionDao;
import com.pojo.Question;
import com.pojo.QuestionType;
import com.pojo.User;
import com.service.QuestionService;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

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
        questionType.setId(UUID.randomUUID().toString());
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        questionType.setCreatetime(format);
        questionType.setIsdelete(0);
        int i = questionDao.newSubjectType(questionType);
        if (i > 0) {
            mark = true;
        }
        return mark;
    }


    //     修改科目类型在Service层的具体实现
    @Override
    public boolean modifySubjectType(String oldType, String acc, String newType) {
        Map map = new HashMap();
        boolean mark = false;
        map.put("oldType", oldType);
        map.put("acc", acc);
        map.put("newType", newType);
        int i = questionDao.modifySubjectType(map);
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
        if (i > 0) {
            mark = true;
        }
        return mark;
    }

    //    查询是否有重复的科目类型
    @Override
    public boolean whetherRepeat(QuestionType questionType) {
        boolean mark = true;
        List<QuestionType> questionTypes = questionDao.whetherRepeat(questionType);
        if (questionTypes != null) {
            mark = false;
        }
        return mark;
    }

    //    新建题目
    @Override
    public boolean createNewQuestion(Question question) {
        boolean mark = false;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        question.setCreatetime(simpleDateFormat.format(date));
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
