//篠崎作成
package com.kintai.main.entity;

import java.util.Date;

import javax.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
@Data
@Entity
public class EmployeeDao {
	
	
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
	    @Column(name = "CREATE_DATE")
	    private Date CREATE_DATE;

	    @Column(name = "CREATE_USER")
	    private String CREATE_USER;

	    @Column(name = "UPDATE_DATE")
	    private Date UPDATE_DATE;

	    @Column(name = "UPDATE_USER")
	    private String UPDATE_USER;
	    @PrePersist
	    protected void onCreate() {
	        CREATE_DATE = new Date();
	        // ログインユーザーIDを設定するコードをここに追加
	    }

	    @PreUpdate
	    protected void onUpdate() {
	        UPDATE_DATE = new Date();
	        // ログインユーザーIDを設定するコードをここに追加
	    }
	    // 他のフィールド
	    // getters and setters
	}

