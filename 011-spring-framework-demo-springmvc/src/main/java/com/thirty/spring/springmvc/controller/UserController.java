package com.thirty.spring.springmvc.controller;

import com.thirty.spring.springmvc.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-31 16:23
 * @ClassName UserController
 * @description: user控制类
 */
@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/user")
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("dateTime", new Date());
        modelAndView.addObject("userList", userService.findUserList());
        modelAndView.setViewName("userList"); // views目录下的userList.jsp;
        return modelAndView;
    }
}
