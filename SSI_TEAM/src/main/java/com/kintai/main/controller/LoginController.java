package com.kintai.main.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class LoginController {
    @SuppressWarnings("deprecation")
	@GetMapping("/user/login")
    public String login(@RequestParam("username")String usernam,
                        @RequestParam("password") String password,
                        Model model){
        if(!StringUtils.isEmpty(usernam)&&"123456".equals(password)){
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","　社員IDは存在しません");
            return "index";
        }
    }
}