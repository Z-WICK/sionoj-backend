package com.sion.sionoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sion.sionoj.model.entity.Question;
import com.sion.sionoj.service.QuestionService;
import com.sion.sionoj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author wick
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-10-27 11:09:08
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




