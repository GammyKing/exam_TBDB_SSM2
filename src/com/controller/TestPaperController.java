package com.controller;

import com.pojo.Question;
import com.pojo.User;
import com.service.TestPaperService;
import com.service.impl.TestPaperImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/**
 *功能描述:<br>
 *<试卷模块controller>
 *@Param:
 *@Return:
 *@Author:WBW
 *@Date:2021/1/21 11:08
 */

@Controller
public class TestPaperController {

    @RequestMapping("/selectAllQuestion")
    @ResponseBody
    public List<Question> selectAllQuestion(@RequestBody User user){
        TestPaperService testPaperService=new TestPaperImpl();
        List<Question> questions = testPaperService.selectAllQuestion(user);
        return questions;
    }
}
