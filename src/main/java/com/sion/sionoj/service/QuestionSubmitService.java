package com.sion.sionoj.service;

import com.sion.sionoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.sion.sionoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sion.sionoj.model.entity.User;

/**
* @author wick
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-10-27 11:10:05
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);


}