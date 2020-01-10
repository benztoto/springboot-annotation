package com.lwt.springbootannotation.service.impl;/*
@author:liuwentao

@create date:2020/1/10
*/

import com.lwt.springbootannotation.bean.TAdmin;
import com.lwt.springbootannotation.mapper.AdminMapper;
import com.lwt.springbootannotation.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public TAdmin getAdminById(Integer id){
        TAdmin admin = adminMapper.getAdminId(id);

        System.out.println(admin);

        return admin;
    }

}
