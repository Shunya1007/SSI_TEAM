//篠崎作成
package com.kintai.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kintai.main.entity.Employee;
import com.kintai.main.service.EmployeeServiceR;

@Controller
@RequestMapping("/employees")
public class EmployeeControllerR {

    private final EmployeeServiceR employeeService;

    @Autowired
    public EmployeeControllerR(EmployeeServiceR employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/form")
    public String showEmployeeForm(Model model) {
        Employee employee = new Employee(); // Employee オブジェクトの初期化（適切な初期値を設定する）
        model.addAttribute("employee", employee); // モデルに追加
        model.addAttribute("isUpdate", true); // 例えば更新リンクが押された場合
        return "employee_info_register";
    }
}