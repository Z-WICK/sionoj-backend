package com.sion.sionoj.judge;

import com.sion.sionoj.model.entity.QuestionSubmit;

public interface JudgeService {

    /**
     * 执行判题
     * @param questionSubmitId
     * @return {@link QuestionSubmit }
     */
    QuestionSubmit doJudge(long questionSubmitId);

}
