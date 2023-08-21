package com.kintai.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kintai.main.entity.Dept;
import com.kintai.main.repository.DeptRepository;

@Service
public class DeptServiceR {

    private final DeptRepository deptRepository;

    @Autowired
    public DeptServiceR(DeptRepository deptRepository) {
        this.deptRepository = deptRepository;
    }

    public List<Dept> getDeptAll() {
        return deptRepository.findAll();
    }
}
