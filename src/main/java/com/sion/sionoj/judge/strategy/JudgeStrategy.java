package com.sion.sionoj.judge.strategy;

import com.sion.sionoj.model.dto.questionsubmit.JudgeInfo;

public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return {@link JudgeInfo }
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
