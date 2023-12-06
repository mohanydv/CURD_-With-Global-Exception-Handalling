package com.mhn.poc.service;

import java.util.List;


import com.mhn.poc.entity.Employee;
import com.mhn.poc.model.EmployeeRequestResponse;

public interface EmployeeSevice {

	Employee getEmployeeById(Integer id);

	List<Employee> getAllEmployee();



	Employee updateEmployeeDetails(Integer id, EmployeeRequestResponse employee);


	void deleteEmployeeById(Integer id);

	Employee saveEmployeeDetails(EmployeeRequestResponse employee);
	


	


}
