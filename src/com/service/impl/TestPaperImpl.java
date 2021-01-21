package com.service.impl;

import com.dao.TestPaperDao;
import com.pojo.Question;
import com.pojo.User;
import com.service.TestPaperService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *功能描述:<br>
 *<试卷模块具体实现>
 *@Param:
 *@Return:
 *@Author:WBW
 *@Date:2021/1/21 11:10
 */

@Service
public class TestPaperImpl implements TestPaperService {

    TestPaperDao testPaperDao;

    //根据用户账号查询所有试题
    @Override
    public List<Question> selectAllQuestion(User user) {
        List<Question> questions = testPaperDao.selectAllQuestion(user);
        return questions;
    }


}
