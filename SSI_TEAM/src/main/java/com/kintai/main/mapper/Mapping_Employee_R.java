package com.kintai.main.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kintai.main.entity.Employee_r_dao;
@Mapper
public interface Mapping_Employee_R {
	
	
	void insertEmployee(Employee_r_dao employee_r_dao);
	void updateEmployee(Employee_r_dao employee_r_dao);
	
}
