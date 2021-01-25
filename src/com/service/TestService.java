package com.service;

import com.pojo.Paper;
import com.pojo.Title;

import java.util.List;

public interface TestService {
    //  检查答案，将内容与答案做比较，这里不应该返回String类型，直接返回数据库内容，在Service层做比较，回到Dao层做数据录入。
    List<Integer> checkanswer(List<String> stem, List<String> answer);

    //  删除考试。传入examname和acc
    boolean deleteTest(Title title);

    //  开始考试，学生接收到考试卷的UUID作为校验码输入
    List<String> startTest(String uuid);

    //  考试创建
    boolean createTest(Title title);
}
