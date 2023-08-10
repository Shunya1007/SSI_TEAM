package com.kintai.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kintai.main.entity.Dept;

@Repository
public interface DeptRepository  extends JpaRepository <Dept, Long> {
	

}
