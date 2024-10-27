package com.sion.sionoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sion.sionoj.common.ErrorCode;
import com.sion.sionoj.exception.BusinessException;
import com.sion.sionoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.sion.sionoj.model.entity.Question;
import com.sion.sionoj.model.entity.QuestionSubmit;
import com.sion.sionoj.model.entity.User;
import com.sion.sionoj.model.enums.QuestionSubmitLanguageEnum;
import com.sion.sionoj.model.enums.QuestionSubmitStatusEnum;
import com.sion.sionoj.service.QuestionService;
import com.sion.sionoj.service.QuestionSubmitService;
import com.sion.sionoj.mapper.QuestionSubmitMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wick
 * @description 针对表【question_submit(题目提交)】的数据库操作Service实现
 * @createDate 2024-10-27 11:10:05
 */
@Service
public class QuestionSubmitServiceImpl extends ServiceImpl<QuestionSubmitMapper, QuestionSubmit>
        implements QuestionSubmitService {

    @Resource
    private QuestionService questionService;

    /**
     * 提交题目
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return 提交记录的ID
     */
    @Override
    public long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser) {
        //  校验编程语言
        String language = questionSubmitAddRequest.getLanguage();
        QuestionSubmitLanguageEnum languageEnum = QuestionSubmitLanguageEnum.getEnumByValue(language);
        if (languageEnum == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "不支持的编程语言");
        }

        Long questionId = questionSubmitAddRequest.getQuestionId();
        // 判断实体是否存在，根据类别获取实体
        Question question = questionService.getById(questionId);
        if (question == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR);
        }
        // 是否已提交题目
        long userId = loginUser.getId();
        // 每个用户串行提交题目
        QuestionSubmit questionSubmit = new QuestionSubmit();
        questionSubmit.setUserId(userId);
        questionSubmit.setQuestionId(questionId);
        questionSubmit.setCode(questionSubmitAddRequest.getCode());
        questionSubmit.setLanguage(language);
        //  设置初始状态
        questionSubmit.setStatus(QuestionSubmitStatusEnum.WAITING.getValue());
        questionSubmit.setJudgeInfo("{}");
        boolean save = this.save(questionSubmit);
        if (!save) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "数据插入失败");
        }
        return questionSubmit.getId();

    }


}




