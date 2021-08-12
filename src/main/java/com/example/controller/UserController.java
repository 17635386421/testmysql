package com.example.controller;

import com.example.entity.PmsCategory;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    List<PmsCategory> categoryList;
    int i = 0;

    @RequestMapping("get")
    //@Scheduled(cron = "*/2 * * * * *")
    public List<PmsCategory> GetUser(){
        categoryList = userService.Sel();
        System.out.println(categoryList);
        System.out.println("----"+ i++ +"----");
        return categoryList;
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello world";
    }
}
