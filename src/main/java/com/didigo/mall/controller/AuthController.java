package com.didigo.mall.controller;


import com.didigo.mall.vo.BaseResponseVo;
import com.didigo.mall.vo.LoginVo;
import com.didigo.mall.vo.UserInfoVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AuthController {


    @RequestMapping("admin/auth/login")
    public BaseResponseVo login(@RequestBody LoginVo vo){
        //提取方法：前端返回的是一个java bean
//        BaseResponseVo<String> stringBaseResponseVo = new BaseResponseVo<>();
//        stringBaseResponseVo.setData("84c40030-f97e-4754-be42-ec29c93457f9");
//        stringBaseResponseVo.setErrmsg("success");
//        stringBaseResponseVo.setErrno(0);
        BaseResponseVo check = BaseResponseVo.checkSuccess("84c40030-f97e-4754-be42-ec29c93457f9");

        return  check;
    }
    @RequestMapping("admin/auth/info")
    public BaseResponseVo info(String token){
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setAvater("");
        userInfoVo.setName("admin123");
        ArrayList roles = new ArrayList();
        roles.add("超级管理员");
        userInfoVo.setRoles(roles);
        ArrayList perms = new ArrayList();
        perms.add("*");
        userInfoVo.setPerms(perms);

        //封入javaBean
        BaseResponseVo check = BaseResponseVo.checkSuccess(userInfoVo);
        return check;
    }
}
