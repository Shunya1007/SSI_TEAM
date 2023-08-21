package com.kintai.main.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpInfoSearchRequest implements Serializable{
	
	private int employeeId;
    private String employeeName;
    private String deptId;
    private String deptName;
    private String sexId;
    private String sexName;
    private String telNo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date nyushaDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date nyushaDateS;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date nyushaDateE;
    private int age;
    private String mailAddress;
    
	
	
	
	

}
