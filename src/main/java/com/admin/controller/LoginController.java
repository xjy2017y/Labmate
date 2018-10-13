package com.admin.controller;

import com.admin.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
@Controller
@RequestMapping("/home")
public class LoginController {

    @Resource
    private ILoginService loginService;

    @ResponseBody
    @RequestMapping("/login")
    public Object login(String wechat){
        //String wechat = (String) req.getAttribute("wechat");
        System.out.println(wechat);
        boolean isTrue = loginService.login(wechat);
        System.out.println(isTrue);
        return isTrue;
    }

}
