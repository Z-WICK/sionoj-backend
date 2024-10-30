package com.sion.sionoj.judge.codesandbox;

import com.sion.sionoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.sion.sionoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {

     /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
