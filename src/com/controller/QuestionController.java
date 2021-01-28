package com.controller;

import com.pojo.Question;
import com.pojo.QuestionType;
import com.pojo.User;
import com.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *功能描述:<br>
 *<题库模块Controller>
 *@Param:
 *@Return:
 *@Author:WBW
 *@Date:2021/1/21 11:50
 */

@Controller
public class QuestionController {
    @Autowired
    QuestionService questionService;
//    查询所有科目类型,返回值为所有科目组成的集合
    @RequestMapping("/queryAllQuestionType")
    @ResponseBody
    public List<String> queryAllQuestionTypeController(@RequestBody User user){
        return questionService.queryAllQuestionType(user);


    }

//    新建科目类型
    @RequestMapping("/newSubjectType")
    @ResponseBody
    public boolean newSubjectTypeController(@RequestBody QuestionType questionType){
        boolean result=false;
        boolean b = questionService.whetherRepeat(questionType);
        if (b){
            result = questionService.newSubjectType(questionType);
        }
        return result;
    }

//    删除科目类型
    @RequestMapping("/deleteSubjectType")
    @ResponseBody
    public boolean deleteSubjectTypeController(@RequestBody QuestionType questionType){
        System.out.println("Controller:"+questionType);
        return questionService.deleteSubjectType(questionType);
    }

//    新建题目
    @RequestMapping("/createNewQuestion")
    @ResponseBody
    public boolean createNewQuestionController(@RequestBody Question question){
        return questionService.createNewQuestion(question);
    }

//    修改题目
    @RequestMapping("/modifyQuestionContent")
    @ResponseBody
    public boolean modifyQuestionContentController(@RequestBody Question question){
        return questionService.modifyQuestionContent(question);
    }

//    删除题目
    @RequestMapping("deleteQuestion")
    @ResponseBody
    public boolean deleteQuestionController(@RequestBody Question question){
        return questionService.deleteQuestion(question);
    }
}
