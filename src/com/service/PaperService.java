package com.service;


import com.pojo.Paper;
import com.pojo.Title;

import java.util.List;

public interface PaperService {
    //    试题删除
    boolean deleteExam(Paper paper);

    //    试题增加
    boolean addExam(Paper paper);

    //    查询相关试题
    List<Paper> selectRelatedQuestion(Paper paper);

    //    新建试卷
    boolean createTestPaper(Paper paper);

    //    查询所有试卷名
    List<Title> queryAllExamPaper(String acc);
}
