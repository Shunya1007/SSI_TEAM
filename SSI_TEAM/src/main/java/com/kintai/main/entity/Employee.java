package com.kintai.main.entity;
import java.util.Date;

import javax.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity (name = "T_EMPLOYEE")
public class Employee {
 @Id
 private String EMPLOYEE_ID;
 private String EMPLOYEE_NAME;
 private String PASSWORD;
 private String DEPT_ID;
 private String ACCESS;
 private String SEX_ID;
 private int AGE;
 private String TEL_NO;
 private String MAIL_ADDRESS;
 private Date NYUSHA_DATE;
 private String DEL_FLG;
 private Date CREATE_DATE;
 private String CREATE_USER;
 private Date UPDATE_DATE;
 private String UPDATE_USER;

 

	
}
