package com.kintai.main.entity;


import java.io.Serializable;

import lombok.Data;

@Data
public class EmpInfo implements Serializable{
	private int employeeId;
    private String employeeName;
    private String deptName;
    private String sexName;
    private String telNo;
    private String nyushaDate;

    private int age;
    private String mailAddress;

}
