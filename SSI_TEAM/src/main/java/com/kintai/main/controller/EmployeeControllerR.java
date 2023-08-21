package com.kintai.main.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kintai.main.entity.Dept;
import com.kintai.main.entity.Employee;
import com.kintai.main.entity.EmployeeDao;
import com.kintai.main.service.DeptServiceR; // DeptServiceRをインポート
import com.kintai.main.service.EmployeeServiceR;

import lombok.RequiredArgsConstructor;


@Controller
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeControllerR {

    private final EmployeeServiceR employeeService;
    private final DeptServiceR deptService; // DeptServiceRを修正

   
//    public EmployeeControllerR(EmployeeServiceR employeeService, DeptServiceR deptService) {
//        this.employeeService = employeeService;
//        this.deptService = deptService;
//    }

    @GetMapping("/form")
    public String showEmployeeForm(EmployeeDao employeeDao,  Model model) {
        model.addAttribute("isUpdate", true);

        Employee employee = new Employee();
        employee.setEMPLOYEE_ID("12345"); // 実際のデータに置き換える
        employee.setEMPLOYEE_NAME("John Doe"); // 実際のデータに置き換える
        // 他のプロパティも同様に設定

        model.addAttribute("employee", employee);

        List<Dept> departments = deptService.getDeptAll();
        model.addAttribute("departments", departments);

        return "employee_info_register";
    }
}
