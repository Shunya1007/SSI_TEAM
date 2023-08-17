package com.kintai.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kintai.main.entity.Sex;

@Repository
public interface SexRepository extends JpaRepository<Sex, String> {
   
}