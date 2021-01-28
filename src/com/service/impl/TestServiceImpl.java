package com.service.impl;

import com.dao.TestDao;
import com.pojo.Paper;
import com.pojo.Score;
import com.pojo.Title;
import com.service.TestService;
import com.util.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author xhz
 * @description 创建考试的实现类
 * @date 2021-01-25
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestDao examDao;

    //  答案检查 用集合返回答案。
    @Override
    public List<Integer> checkanswer(List<String> stem, List<String> answer) {
//    每一次查一次库
        Paper paper1 = new Paper();
        Paper paper2;
        Score score = new Score();
        Date date = new Date();
        List<Integer> scoreList = new ArrayList<>();
        for (int i = 0; i < stem.size(); i++) {
            paper1.setStem(stem.get(i));
            paper2 = examDao.checkanswer(paper1);
            boolean mark = answer.get(i).equals(paper2.getAnswer());
            if (mark) {
//               成绩入库，以及返回前端 以集合返回
                scoreList.add(paper2.getScore());

//               后端入库准备，对象属性赋值。
                score.setStuName(paper2.getAcc());
                score.setStuScore(paper2.getScore());
                score.setId(UUID.randomUUID().toString());
                score.setAuthor(paper2.getAcc());
                score.setExamName(examDao.getExamName(paper2.getAcc()));
                score.setSubject(paper2.getSubject());
                score.setCreateTime(DateFormatUtil.date2String(date));
                score.setIsDelete(0);
                examDao.insertScore(score);
            }
        }
        return scoreList;
    }

    //  删除试卷
    @Override
    public boolean deleteTest(Title title) {
        int i = examDao.deleteTest(title);
        return i == 1;
    }

    //  开始考试
    @Override
    public List<String> startTest(String uuid) {
        String name = examDao.findName(uuid);
        return examDao.startTest(name);
    }

    //  创建考试
    @Override
    public boolean createTest(@RequestBody Title title) {
        Date date = new Date();
        title.setId(UUID.randomUUID().toString());
        title.setIsdelete(0);
        title.setCreatetime(DateFormatUtil.date2String(date));
        int i = examDao.createTest(title);
        return i == 1;
    }
}
