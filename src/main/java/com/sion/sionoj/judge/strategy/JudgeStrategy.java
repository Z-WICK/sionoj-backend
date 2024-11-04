package com.sion.sionoj.judge.strategy;

import com.sion.sionoj.judge.codesandbox.model.JudgeInfo;

public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return {@link JudgeInfo }
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
