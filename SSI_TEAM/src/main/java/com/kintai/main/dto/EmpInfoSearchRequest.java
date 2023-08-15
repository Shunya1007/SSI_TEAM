package com.kintai.main.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class EmpInfoSearchRequest implements Serializable{
	
	private int employee_id;
    private String employee_name;
    private String dept_id;
    private String dept_name;
    private String sex_id;
    private String sex_name;
    private String tel_no;
    private Date nyusha_date;
    private int age;
    private String mail_address;
    
	
	
	
	

}
