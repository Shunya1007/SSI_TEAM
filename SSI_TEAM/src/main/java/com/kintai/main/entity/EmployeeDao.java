package com.kintai.main.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Data
@Entity(name = "t_employee") // テーブル名
public class EmployeeDao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "employee_id",length =10) // カラム名と一致させる
    private String EMPLOYEE_ID;
    @Column(name = "password",length =20)
    private String PASSWORD;
    
    @Column(name = "employee_name",length =100) // カラム名と一致させる
    private String EMPLOYEE_NAME;
    
    @Column(name = "dept_id",length =10) // カラム名と一致させる
    private String DEPT_ID;
    @Column(name = "access",length =1)
    private String ACCESS;
    
    @Column(name = "sex_id",length =1) // カラム名と一致させる
    private String SEX_ID;
    @Column(name = "age",length =3)
    private int AGE;
    
    @Column(name = "tel_no",length =11) // カラム名と一致させる
    private String TEL_NO;
    
    @Column(name = "mail_address",length =100) // カラム名と一致させる
    private String MAIL_ADDRESS;
    
    @Column(name ="nyusha_date")
    private Date NYUSHA_DATE;
    
    @Column(name = "del_flg",length = 1) // カラム名と一致させる
    private String DEL_FLG;
    
    @Column(name = "create_date") // カラム名と一致させる
    private Date CREATE_DATE;

    @Column(name = "create_user",length =10) // カラム名と一致させる
    private String CREATE_USER;

    @Column(name = "update_date") // カラム名と一致させる
    private Date UPDATE_DATE;

    @Column(name = "update_user",length = 10) // カラム名と一致させる
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
