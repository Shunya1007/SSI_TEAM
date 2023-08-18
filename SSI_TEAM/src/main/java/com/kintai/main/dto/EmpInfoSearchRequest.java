package com.kintai.main.dto;

import java.io.Serializable;

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
    private String nyushaDate;
    private String nyushaDateS;
    private String nyushaDateE;
    private int age;
    private String mailAddress;
    
	
	
	
	

}
