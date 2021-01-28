package com.service.impl;

import com.dao.PaperDao;
import com.pojo.Paper;
import com.pojo.Question;
import com.pojo.Title;
import com.service.PaperService;
import com.util.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author xhz
 * @description 试卷实现类
 * @date 2021-01-23
 */
@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    PaperDao paperDao;

    //  删除试题库中的试题
    @Override
    public boolean deleteExam(Paper paper) {
        paper.setIsdelete("1");
        return paperDao.delete_paper_with_stem(paper);
    }

    //    从题库选择题目添加进试题
    @Override
    public boolean addExam(Paper paper) {
        List<Question> question = paperDao.find_in_question_bank(paper);
        Question q = question.get(0);
        return paperDao.insert_into_paper(q);
    }

    //  显示相关试题
    @Override
    public List<Paper> selectRelatedQuestion(Paper paper) {
        return paperDao.query_related_question(paper);
    }

    //  新建试卷
    @Override
    public boolean createTestPaper(Paper paper) {
        Date date = new Date();
        String time = DateFormatUtil.date2String(date);
//        设置创建时间
        paper.setCreatetime(time);
//        设置默认删除状态
        paper.setIsdelete("0");
//        设置id
        paper.setId(UUID.randomUUID().toString());
        return paperDao.create_new_paper(paper);
    }

    //  显示所有试题
    @Override
    public List<Title> queryAllExamPaper(String acc) {
        return paperDao.query_all_title(acc);
    }

}
