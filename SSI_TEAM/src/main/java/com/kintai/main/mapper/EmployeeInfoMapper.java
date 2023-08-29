package com.kintai.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kintai.main.dto.EmpInfoSearchRequest;
import com.kintai.main.entity.EmpInfo;
import com.kintai.main.entity.Employee;

/**
 * 社員情報情報 Mapper
 */
@Mapper
public interface EmployeeInfoMapper {
	/**
	 * 社員情報検索
	 * 
	 * @param employee 検索用リクエストデータ
	 * @return 検索結果
	 */
	List<Employee> search(EmpInfoSearchRequest employee);

	List<EmpInfo> findAll();

	void delete(Long employee_id);
}
