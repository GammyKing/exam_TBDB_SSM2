package com.controller;

import com.alibaba.druid.sql.PagerUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.Question;
import com.pojo.User;
import com.service.TestPaperService;
import com.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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
    @Autowired
    TestPaperService testPaperService;

    @RequestMapping("/selectAllQuestion")
    @ResponseBody
    public PageUtils selectAllQuestion(@RequestBody Map<String,Object> params){
        String acc = params.get("acc").toString();
        User user = new User();
        user.setAcc(acc);
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        List<Question> questions = testPaperService.selectAllQuestion(user);
//        System.out.println(acc);
//        System.out.println(user);
//        System.out.println("Contorller测试："+questions);
        PageInfo<Question> pageInfo = new PageInfo<>(questions);
        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }
}
