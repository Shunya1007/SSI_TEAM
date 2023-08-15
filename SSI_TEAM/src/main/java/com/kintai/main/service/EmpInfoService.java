package com.kintai.main.service;

import java.util.List;

import com.kintai.main.dto.EmpInfoSearchRequest;
import com.kintai.main.entity.Employee;
import com.kintai.main.mapper.EmployeeInfoMapper;

public class EmpInfoService {
	
	private EmployeeInfoMapper employeeInfoMapper;
	
	/**
     * 社員情報一覧検索
     * @return 検索結果
     */
	public List<Employee> search(EmpInfoSearchRequest empInfoSearchRequest){
		return employeeInfoMapper.search(empInfoSearchRequest);

	}

	public void delete(Long employee_id) {
		employeeInfoMapper.delete(employee_id);
    }
	
	
	
}
