package com.kintai.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kintai.main.entity.EmployeeDao;


public interface EmployeeDaoRepository extends JpaRepository<EmployeeDao, Long> {
    // 他のカスタムクエリメソッドを宣言可能
}