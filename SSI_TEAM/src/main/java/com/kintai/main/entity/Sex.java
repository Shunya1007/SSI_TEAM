//篠崎作成
package com.kintai.main.entity;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity (name = "M_SEX")
public class Sex {
	 @Id
	 private int SEX_ID;
	 private String SEX;
	 private Date CREATE_DATE;
	 private String CREATE_USER;
	 private Date UPDATE_DATE;
	 private String UPDATE_USER;


}
