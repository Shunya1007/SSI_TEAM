package com.kintai.main.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SearchRequest implements Serializable{
	private String employeeId;
	
	private String deptId;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate nyushaDates;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate nyushaDatee;
	
}
