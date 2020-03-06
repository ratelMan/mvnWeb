package com.project.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
@Controller
@RequestMapping("student")
public class StudentAction {

    @RequestMapping("test")
    public String test(){
        System.out.println("执行test方法");

        return "/index.jsp";
    }

}
