package com.kintai.main.entity;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity (name = "M_DEPT")
public class Dept {
	 @Id
	 private String DEPT_ID;
	 private String DEPT_NAME;
	 private Date CREATE_DATE;
	 private String CREATE_USER;
	 private Date UPDATE_DATE;
	 private String UPDATE_USER;

	
	
	
}
