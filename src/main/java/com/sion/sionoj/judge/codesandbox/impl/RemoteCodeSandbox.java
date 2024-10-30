package com.sion.sionoj.judge.codesandbox.impl;

import com.sion.sionoj.judge.codesandbox.CodeSandbox;
import com.sion.sionoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.sion.sionoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @Author : wick
 * @Date : 2024/10/30 19:36
 * 远程代码沙箱（实际调用接口的沙箱）
 */

public class RemoteCodeSandbox implements CodeSandbox {


    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱执行代码");
        return null;
    }
}
