package com.kintai.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kintai.main.dto.EmpInfoSearchRequest;
import com.kintai.main.dto.SearchRequest;
import com.kintai.main.entity.EmpInfo;
import com.kintai.main.entity.Employee;
import com.kintai.main.entity.EmployeeDao;
import com.kintai.main.mapper.EmployeeInfoMapper;
@Service
public class EmpInfoService {
	@Autowired
	private EmployeeInfoMapper employeeInfoMapper;
	
	/**
     * 社員情報一覧検索
     * @return 検索結果
     */
	public List<Employee> search(EmpInfoSearchRequest empInfoSearchRequest){
		return employeeInfoMapper.search(empInfoSearchRequest);

	}
	
	public List<EmpInfo> getAll(){
		return employeeInfoMapper.findAll();

	}
	
	public List<EmpInfo> search2(SearchRequest request){
		return employeeInfoMapper.findByRequest(request);

	}

	public void delete(Long employee_id) {
		employeeInfoMapper.delete(employee_id);
    }
	
	
	public void insert(EmployeeDao dao) {
		
		dao.setPassword("012");
		
		employeeInfoMapper.add(dao);
    }
	
}
