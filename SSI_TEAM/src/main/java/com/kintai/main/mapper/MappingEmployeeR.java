//篠崎作成
package com.kintai.main.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kintai.main.entity.Employee;
@Mapper
public interface MappingEmployeeR {
	
	
	void insertEmployee(Employee employee);
	void updateEmployee(Employee employee);
	
}
