package com.mhn.poc.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mhn.poc.entity.Employee;
import com.mhn.poc.exception.ResourceNotFoundException;
import com.mhn.poc.model.EmployeeRequestResponse;
import com.mhn.poc.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeSevice {

	private static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee getEmployeeById(Integer id) {

		return employeeRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("user not found with given value" + id));

	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll(Sort.by(Sort.Direction.ASC,"eName") );

	}

	@Override
	public Employee saveEmployeeDetails(EmployeeRequestResponse employee) {

		Employee employeeEntity = new Employee();
		BeanUtils.copyProperties(employee, employeeEntity);
		log.info(employeeEntity.toString());
		return this.employeeRepo.save(employeeEntity);
	}

	@Override
	public Employee updateEmployeeDetails(Integer id, EmployeeRequestResponse employee) {
		Employee emp = employeeRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee Not exist with this Id:" + id));

		emp.setAge(employee.getAge());
		emp.setDepartment(employee.getDepartment());
		emp.seteName(employee.geteName());
		emp.seteSalary(employee.geteSalary());

		log.info(emp.toString());

		return this.employeeRepo.save(emp);

	}

	@Override
	public void deleteEmployeeById(Integer id) {

		employeeRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee Not exist with this Id:" + id));
		this.employeeRepo.deleteById(id);
	}

}
