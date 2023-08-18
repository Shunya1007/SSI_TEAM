package com.kintai.main.entity;

import java.util.Date;

import javax.persistence.Id;

import lombok.Data;

@Data

public class EmployeeDao {
    
    @Id
    
    private Long id;
    
    
    private String employeeId;
    
    private String password;
    
   
    private String employeeName;
    
  
    private String deptId;
  
    private String access;
    
   
    private String sexId;
   
    private int age;
    
    
    private String telNo;
    
  
    private String mailAddress;
    
   
    private Date nyushaDate;
    
   
    private String delFlg;
    
   
    private Date createDate;

    
    private String createUser;

    
    private Date updateDate;

   
    private String updateUser;
    


//    @PrePersist
//    protected void onCreate() {
//        CREATE_DATE = new Date();
//        // ログインユーザーIDを設定するコードをここに追加
//    }
//
//    @PreUpdate
//    protected void onUpdate() {
//        UPDATE_DATE = new Date();
//        // ログインユーザーIDを設定するコードをここに追加
//    }
    // 他のフィールド
    // getters and setters
}
