package com.lwt.springbootannotation.mapper;/*
@author:liuwentao

@create date:2020/1/10
*/

import com.lwt.springbootannotation.bean.TAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


public interface AdminMapper {

    @Select("select * from t_admin where id=#{id}")
    public TAdmin getAdminId(Integer id);
}
