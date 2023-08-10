package com.kintai.main.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Employee_r_dao {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int EMPLOYEE_ID;
	    private String PASSWORD;
	    private String EMPLOYEE_NAME;
	    private String DEPT_NAME;
	    private String SEX_NAME;
	    private String TEL_NO;
	    private Date NYUSHA_DATE;
	    private int AGE;
	    private String MAIL_ADDRESS;
	    
	    // 他のフィールド
	    // getters and setters
	}

