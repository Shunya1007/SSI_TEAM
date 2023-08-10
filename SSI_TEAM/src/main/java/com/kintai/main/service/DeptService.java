package com.kintai.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kintai.main.entity.Dept;
import com.kintai.main.repository.DeptRepository;

public class DeptService {
	@Autowired
	private DeptRepository deptRepository;
	
	public List<Dept> getDeptAll(){
		return deptRepository.findAll();
	}

}
