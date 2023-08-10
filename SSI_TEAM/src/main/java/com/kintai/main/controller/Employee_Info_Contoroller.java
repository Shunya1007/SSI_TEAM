package com.kintai.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kintai.main.entity.Dept;
import com.kintai.main.service.DeptService;



@Controller
public class  Employee_Info_Contoroller{
	@Autowired
	private DeptService deptService;
	
	@GetMapping(value = "/empInfoDept")
	public String displayList(Model model) {
		List<Dept> deptList = deptService.getDeptAll();
		model.addAttribute("deptList", deptList);
		
		return "EMPLOYEE_INFO";
	}

	
	

}
