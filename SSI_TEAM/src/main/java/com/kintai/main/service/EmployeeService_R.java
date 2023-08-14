package com.kintai.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kintai.main.entity.Employee_r_dao;
import com.kintai.main.mapper.Mapping_Employee_R;

@Service
public class EmployeeService_R {

    private final Mapping_Employee_R employeeMapper;

    @Autowired
    public EmployeeService_R(Mapping_Employee_R employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Transactional
    public void insertEmployee(Employee_r_dao employee) {
        employeeMapper.insertEmployee(employee);
    }

    @Transactional
    public void updateEmployee(Employee_r_dao employee) {
        employeeMapper.updateEmployee(employee);
    }

    // 
}
