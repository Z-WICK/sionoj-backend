package com.sion.sionoj.judge.codesandbox;

import com.sion.sionoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.sion.sionoj.judge.codesandbox.impl.RemoteCodeSandbox;

/**
 * @Author : wick
 * @Date : 2024/10/30 20:23
 */
public class CodeSandboxFactory {
    /**
     * 创建代码沙箱示例
     *
     * @param type 沙箱类型
     * @return
     */
    public static CodeSandbox newInstance(String type) {
        switch (type){
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new RemoteCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }


}
