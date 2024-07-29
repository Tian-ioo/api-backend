package com.tian.tianapiinterface.controller;

import com.tian.tianapiclientsdk.model.User;
import com.tian.tianapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@RestController()
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name,HttpServletRequest request){
        request.getHeader("tian");
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request){
        /*String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");
        //todo 实际情况应该是去数据库中查出是否已分配给用户
        if(!accessKey.equals("tian")){
            throw  new RuntimeException("无权限");
        }
        if(Long.parseLong(nonce) > 10000){
            throw  new RuntimeException("无权限");
        }
        //TODO 判断时间，和current时间对比，超过5分钟过期，防止请求重放问题
        //TODO 实际情况中是从数据库中查出 secertKey
        String serverSign = SignUtils.genSign(body, "abcdefgh");
        if(!sign.equals(serverSign)){
            throw  new RuntimeException("无权限");
        }*/
        String result = "POST 用户名字是" + user.getUsername();
        return result;
    }
}
