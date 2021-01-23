package com.controller;

import com.pojo.Paper;
import com.pojo.Title;
import com.service.PaperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xhz
 * @description 试卷模块控制器
 * @date 2021-01-23
 */
@Controller
public class PaperController {
    PaperService paperService;
//  删除试题库中的试题
    @RequestMapping(value = "/deleteExam")
    @ResponseBody
    public boolean deleteExam(@RequestBody Paper paper){
        return paperService.deleteExam(paper);
    }

//    从题库选择题目添加进试题
    @RequestMapping(value = "/addExam")
    @ResponseBody
    public boolean addExam(@RequestBody Paper paper){
        return paperService.addExam(paper);
    }

//    显示相关试题
    @RequestMapping("/selectRelatedQuestion")
    @ResponseBody
    public List<Paper> selectRelatedQuestion(@RequestBody Paper paper){
        return paperService.selectRelatedQuestion(paper);
    }

//    新建试卷
    @RequestMapping(value = "/createTestPaper")
    @ResponseBody
    public boolean createTestPaper(@RequestBody Paper paper){
        return paperService.createTestPaper(paper);
    }

//    显示所有试题
    @RequestMapping(value = "/queryAllExamPaper")
    @ResponseBody
    public List<Title> queryAllExamPaper(@RequestBody Paper paper){
        return paperService.queryAllExamPaper(paper.getAcc());
    }


}
