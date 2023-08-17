//篠崎作成
package com.kintai.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kintai.main.entity.EmployeeDao;
import com.kintai.main.mapper.MappingEmployeeR;

@Service
public class EmployeeServiceR {

    private final MappingEmployeeR employeeMapper;

    @Autowired
    public EmployeeServiceR(MappingEmployeeR employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Transactional
    public void insertEmployee(EmployeeDao employee) {
        employeeMapper.insertEmployee(employee);
    }

    @Transactional
    public void updateEmployee(EmployeeDao employee) {
        employeeMapper.updateEmployee(employee);
    }

    // 
}
