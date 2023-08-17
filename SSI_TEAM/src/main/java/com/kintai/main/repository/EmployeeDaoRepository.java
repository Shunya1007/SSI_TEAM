package com.kintai.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kintai.main.entity.EmployeeDao;

@Repository
public interface EmployeeDaoRepository extends JpaRepository<EmployeeDao, String> {
    // 他のカスタムクエリメソッドを宣言可能
}