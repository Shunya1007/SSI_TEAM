package com.kintai.main.controller;
//池上作成オントローラークラス

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
import com.kintai.main.dto.SearchRequest;
import com.kintai.main.entity.Dept;
import com.kintai.main.entity.EmpInfo;
import com.kintai.main.entity.Employee;
import com.kintai.main.service.DeptService;
import com.kintai.main.service.EmpInfoService;



@Controller
public class  EmployeeInfoContoroller{
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
	public String displayList(SearchRequest request,EmpInfoSearchRequest empInfoSearchRequest, Model model) {
		List<Dept> deptList = deptService.getDeptAll();
		List<EmpInfo> empList = empInfoService.getAll();
		
		model.addAttribute("deptList", deptList);
		model.addAttribute("empList", empList);
		
		return "EMPLOYEE_INFO";
	}

	
    /**
     * 社員情報検索
     * @param employeeSearchRequest リクエストデータ
     * @param model Model
     * @return 社員情報一覧画面
     */
	@RequestMapping(value = "/employee/search", method = RequestMethod.POST)
    public String search(SearchRequest searchRequest, Model model) {
        //System.out.println("hello");
		//List<Employee> empList = empInfoService.search(empInfoSearchRequest);
        //model.addAttribute("emplist", empList);
		List<Dept> deptList = deptService.getDeptAll();
		List<EmpInfo> empList =  empInfoService.search2(searchRequest);
        model.addAttribute("empList",empList);
        model.addAttribute("deptList", deptList);
        //System.out.println("hello２");
        return "EMPLOYEE_INFO";
    }
	
	@GetMapping("/empinfo/delete")
    public String delete(@PathVariable Long employee_id, Model model) {
        // ユーザー情報の削除
        empInfoService.delete(employee_id);
        return "redirect:/empInfoDept";
    }
	
	
	
	

}
