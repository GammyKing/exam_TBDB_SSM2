package com.dao;

import com.pojo.Paper;
import com.pojo.Score;
import com.pojo.Title;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {
    //    答案较对
    Paper checkanswer(Paper paper);

    String getExamName(String acc);

    //    成绩录入
    int insertScore(Score score);

    //    删除考试
    int deleteTest(Title title);

    //    开始考试
    String findName(String uuid);

    List<String> startTest(String examName);

    //    创建考试
    int createTest(Title title);
}
