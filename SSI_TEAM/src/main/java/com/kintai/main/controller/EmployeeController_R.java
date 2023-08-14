package com.kintai.main.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Employee_r_dao;
import com.example.demo.service.EmployeeService_R;

@Controller
@RequestMapping("/employees")
public class EmployeeController_R {

    private final EmployeeService_R employeeService;

    @Autowired
    public EmployeeController_R(EmployeeService_R employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/form")
    public String showEmployeeForm(Model model) {
        // isUpdateを設定してフォームに渡す
        model.addAttribute("isUpdate", true); // 例えば更新リンクが押された場合
        return "employee-form";
    }

    @PostMapping("/insert")
    public String insertEmployee(Employee_r_dao employee) {
        // 作成日時を設定
        employee.setCREATE_DATE(new Date());

        // 登録処理を実行
        employeeService.insertEmployee(employee);
        return "redirect:/employees/form";
    }

    @PostMapping("/update")
    public String updateEmployee(Employee_r_dao employee) {
        // 更新日時を設定
        employee.setUPDATE_DATE(new Date());

        // 更新処理を実行
        employeeService.updateEmployee(employee);
        return "redirect:/employees/form";
    }
}
