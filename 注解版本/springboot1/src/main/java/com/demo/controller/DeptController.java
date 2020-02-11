package com.demo.controller;

import com.demo.bean.Department;
import com.demo.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cmcc on 2020-02-11.
 */
@RestController
public class DeptController {
    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){

        return departmentMapper.getDeptById(id);
    }
/*
    @GetMapping("/dept")
    public int insertDeptById(@PathVariable("id") Integer id,@PathVariable("departmentName") String departmentName){
        int ret = departmentMapper.insertDept(id,departmentName);
        return ret;
    }
    */
}