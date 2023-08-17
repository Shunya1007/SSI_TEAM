//篠崎作成
package com.kintai.main.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kintai.main.entity.EmployeeDao;
@Mapper
public interface MappingEmployeeR {
	
	
	void insertEmployee(EmployeeDao employee_r_dao);
	void updateEmployee(EmployeeDao employee_r_dao);
	
}
