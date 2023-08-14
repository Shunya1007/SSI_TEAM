package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Employee_r_dao;
@Mapper
public interface Mapping_Employee_R {
	
	
	void insertEmployee(Employee_r_dao employee_r_dao);
	void updateEmployee(Employee_r_dao employee_r_dao);
	
}
