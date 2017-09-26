package com.sharper.cat.controller;

import java.util.List;

import com.alibaba.fastjson.JSON;

import com.sharper.cat.bean.Admin;
import com.sharper.cat.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/showAllUser")
    private List<Admin> showAllUser(){
        List list =  adminService.findAll();
        System.out.println( JSON.toJSONString(list));
        return list;
    }
}
