package com.lwt.springbootannotation.controller;/*
@author:liuwentao

@create date:2020/1/10
*/

import com.lwt.springbootannotation.bean.TAdmin;
import com.lwt.springbootannotation.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/getAdminById")
    public TAdmin getAdminById (Integer id){
        System.out.println(id);
        return adminService.getAdminById(id);
    }

}
