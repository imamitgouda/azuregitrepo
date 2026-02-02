package com.wip.myapp.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wip.myapp.entity.SEmployee;

@Repository
public interface SEmployeeRepository extends JpaRepository<SEmployee, Long> {
      	
     	
}
