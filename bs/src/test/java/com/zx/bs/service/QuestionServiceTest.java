package com.zx.bs.service;

import com.zx.bs.model.Question;
import com.zx.bs.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionServiceTest {
    @Autowired
    private QuestionService questionService;

    @Test
    public void findQuestionById() {
        Question question=questionService.findQuestionById(1);
        System.out.println(question.getUser().getUser_name());
    }

    @Test
    public void insertQuestion() {
        Question question=new Question();
        question.setQuestion_conent("123");
        User user=new User();
        user.setUser_id("12");
        question.setUser(user);

        int result=questionService.insertQuestion(question);
        assertEquals(1,result);
    }
}