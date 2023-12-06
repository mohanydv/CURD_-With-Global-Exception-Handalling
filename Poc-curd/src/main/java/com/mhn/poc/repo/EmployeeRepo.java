package com.mhn.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhn.poc.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
 

}
