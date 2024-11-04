package com.sion.sionoj.judge;

import com.sion.sionoj.judge.strategy.DefaultJudgeStrategy;
import com.sion.sionoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.sion.sionoj.judge.strategy.JudgeContext;
import com.sion.sionoj.judge.strategy.JudgeStrategy;
import com.sion.sionoj.judge.codesandbox.model.JudgeInfo;
import com.sion.sionoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * @Author : wick
 * @Date : 2024/11/1 11:13
 */
@Service
public class JudgeManager {

    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);

    }

}
