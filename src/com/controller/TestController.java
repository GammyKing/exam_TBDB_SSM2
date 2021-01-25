package com.controller;

import com.pojo.Title;
import com.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xhz
 * @description 考试模块
 * @date 2021-01-25
 */
@Controller
public class TestController {
    TestService examService;

    //  答案较对
    @RequestMapping(value = "/checkanswer")
    @ResponseBody
    public List<Integer> checkanswer(@RequestBody List<String> stem, @RequestBody List<String> answer) {
        return examService.checkanswer(stem, answer);

    }

    //  删除考试
    @RequestMapping(value = "/deleteTest")
    @ResponseBody
    public boolean deleteTest(@RequestBody Title title) {
        return examService.deleteTest(title);

    }

    //    考试开始
    @RequestMapping(value = "/startTest")
    @ResponseBody
    public List<String> startTest(@RequestBody String uuid) {
        return examService.startTest(uuid);
    }

    //    创建考试
    @RequestMapping(value = "/createTest")
    @ResponseBody
    public boolean createTest(@RequestBody Title title) {
        return examService.createTest(title);
    }
}
