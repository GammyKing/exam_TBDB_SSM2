package com.service;

import com.pojo.Question;
import com.pojo.QuestionType;
import com.pojo.User;

import java.util.List;

public interface QuestionService {

    List<String> queryAllQuestionType(User user);

    boolean newSubjectType(QuestionType questionType);

    boolean modifySubjectType(String oldType,String acc,String newType);

    boolean deleteSubjectType(QuestionType questionType);

    boolean whetherRepeat(QuestionType questionType);

    boolean createNewQuestion(Question question);

    boolean modifyQuestionContent(Question question);

    boolean deleteQuestion(Question question);
}
