//篠崎作成
package com.kintai.main.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kintai.main.entity.EmployeeDao;
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
        // isUpdateを設定してフォームに渡す
        model.addAttribute("isUpdate", true); // 例えば更新リンクが押された場合
        return "employee-form";
    }

    @PostMapping("/insert")
    public String insertEmployee(EmployeeDao employee) {
        // 作成日時を設定
        employee.setCREATE_DATE(new Date());

        // 登録処理を実行
        employeeService.insertEmployee(employee);
        return "redirect:/employees/form";
    }

    @PostMapping("/update")
    public String updateEmployee(EmployeeDao employee) {
        // 更新日時を設定
        employee.setUPDATE_DATE(new Date());

        // 更新処理を実行
        employeeService.updateEmployee(employee);
        return "redirect:/employees/form";
    }
}
