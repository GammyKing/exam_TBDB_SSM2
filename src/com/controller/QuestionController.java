package com.controller;

import com.pojo.Question;
import com.pojo.QuestionType;
import com.pojo.User;
import com.service.QuestionService;
import com.service.impl.QuestionServiceImpl;
import org.aspectj.org.eclipse.jdt.internal.core.search.IRestrictedAccessConstructorRequestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
        List<String> strings = questionService.queryAllQuestionType(user);
        return strings;
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

//    修改科目类型
    @RequestMapping("/modifySubjectType")
    @ResponseBody
    public boolean modifySubjectTypeController(String oldType,String acc,String newType){
        boolean result = questionService.modifySubjectType(oldType, acc, newType);
        return result;
    }

//    删除科目类型
    @RequestMapping("/deleteSubjectType")
    @ResponseBody
    public boolean deleteSubjectTypeController(@RequestBody QuestionType questionType){
        boolean result = questionService.deleteSubjectType(questionType);
        return result;
    }

//    新建题目
    @RequestMapping("/createNewQuestion")
    @ResponseBody
    public boolean createNewQuestionController(@RequestBody Question question){
        boolean mark = questionService.createNewQuestion(question);
        return mark;
    }

//    修改题目
    @RequestMapping("/modifyQuestionContent")
    @ResponseBody
    public boolean modifyQuestionContentController(@RequestBody Question question){
        boolean result = questionService.modifyQuestionContent(question);
        return result;
    }

//    删除题目
    @RequestMapping("deleteQuestion")
    @ResponseBody
    public boolean deleteQuestionController(@RequestBody Question question){
        boolean result = questionService.deleteQuestion(question);
        return result;
    }
}
