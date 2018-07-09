package com.winterchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class AccountContnroller {
    @RequestMapping("login")
    public String login(){
        return  "manage/login/login";
    }

    @RequestMapping("loginValidate")
    @ResponseBody
    public Object loginValidate(ModelMap modelMap){
        modelMap.put("success","success");
        return  new ArrayList<>();
    }

    @RequestMapping("index")
    public String index(ModelMap modelMap){
        modelMap.put("success","success");
        return  "manage/index";
    }
}
