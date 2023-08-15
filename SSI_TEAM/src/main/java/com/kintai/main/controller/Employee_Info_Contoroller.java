package com.kintai.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kintai.main.dto.EmpInfoSearchRequest;
import com.kintai.main.entity.Dept;
import com.kintai.main.entity.Employee;
import com.kintai.main.service.DeptService;
import com.kintai.main.service.EmpInfoService;



@Controller
public class  Employee_Info_Contoroller{
	@Autowired
	private DeptService deptService;
	
	@Autowired
	private EmpInfoService empInfoService;
	
	/**
     * 社員情報一覧検索遷移
     * @param employeeSearchRequest リクエストデータ
     * @param model Model
     * @return 社員情報一覧画面
     */
	
	@GetMapping(value = "/empInfoDept")
	public String displayList(Model model) {
		List<Dept> deptList = deptService.getDeptAll();
		model.addAttribute("deptList", deptList);
		
		return "EMPLOYEE_INFO";
	}

	
    /**
     * 社員情報検索
     * @param employeeSearchRequest リクエストデータ
     * @param model Model
     * @return 社員情報一覧画面
     */
	@RequestMapping(value = "/empinfo/search", method = RequestMethod.POST)
    public String search(@ModelAttribute EmpInfoSearchRequest empInfoSearchRequest, Model model) {
        List<Employee> empList = empInfoService.search(empInfoSearchRequest);
        model.addAttribute("emplist", empList);
        return "EMPLOYEE_INFO";
    }
	
	@GetMapping("/empinfo/delete")
    public String delete(@PathVariable Long employee_id, Model model) {
        // ユーザー情報の削除
        empInfoService.delete(employee_id);
        return "redirect:/empInfoDept";
    }
	
	
	
	

}
