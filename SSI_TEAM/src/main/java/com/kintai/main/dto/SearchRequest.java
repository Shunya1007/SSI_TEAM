package com.kintai.main.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class SearchRequest implements Serializable{
	private String employeeId;
	
	private String deptId;
	
}
