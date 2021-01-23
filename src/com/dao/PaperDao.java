package com.dao;

import com.pojo.Paper;
import com.pojo.Question;
import com.pojo.Title;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
 * @Description: 试卷接口
 * @author: xhz
 * @Param:  * @param null
 * @Return:
 * @Date: 2021-01-23
 */
@Mapper
public interface PaperDao {
    //    在题库中查找对应要添加入题库的题
    List<Question> find_in_question_bank(Paper paper);

    boolean insert_into_paper(Question question);

    //    删除试题
    boolean delete_paper_with_stem(Paper paper);

    //    查询相关考试试题内容
    List<Paper> query_related_question(Paper paper);

    //    新建试卷
    boolean create_new_paper(Paper paper);

    //    查询所有试卷名
    List<Title> query_all_title(String acc);
}
