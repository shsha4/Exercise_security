package com.exercise.controller;

import com.exercise.model.UserVO;
import com.exercise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private UserService service;

    @RequestMapping(value = "loginPage", method = RequestMethod.GET)
    public String loginPage() {
        return "loginPage";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String registerPage() {
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String registerAction(@ModelAttribute UserVO user) {
        System.out.println(user.toString());
        int result = service.insertUser(user);
        return "redirect:loginPage";
    }

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String adminPage() {
        return "admin";
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String userPage() {
        return "user";
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public String allPage() {
        return "all";
    }
}

