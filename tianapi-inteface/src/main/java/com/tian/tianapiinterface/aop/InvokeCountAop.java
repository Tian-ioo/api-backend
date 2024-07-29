package com.tian.tianapiinterface.aop;

//import com.yupi.project.service.UserInterfaceInfoService;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.Resource;

@RestControllerAdvice
public class InvokeCountAop {
//    @Resource
//    private UserInterfaceInfoService userInterfaceInfoService;
/*
//     伪代码
//     定义切面触发的时机（什么时候执行方法）controller 接口的方法执行成功后，执行下述方法
    public void doInvokeCount() {
        // 调用方法
        object.proceed();
        // 调用成功后，次数 + 1
        userInterfaceInfoService.invokeCount();
    }*/
}
