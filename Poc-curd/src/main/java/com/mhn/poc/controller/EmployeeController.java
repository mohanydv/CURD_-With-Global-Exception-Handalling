package com.mhn.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhn.poc.entity.Employee;
import com.mhn.poc.model.EmployeeRequestResponse;
import com.mhn.poc.service.EmployeeSevice;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeSevice employeeSevice;

	@GetMapping("/emp/{id}")
	ResponseEntity<Employee> getEmployeeDetail(@PathVariable Integer id) {
		Employee employee = employeeSevice.getEmployeeById(id);
		return ResponseEntity.status(HttpStatus.OK).body(employee);

	}

	@GetMapping("/emp")
	public ResponseEntity<List<Employee>> getallEmployee() {
		List<Employee> emp = employeeSevice.getAllEmployee();
		return ResponseEntity.status(HttpStatus.OK).body(emp);

	}

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeRequestResponse employee) {
		Employee empl = employeeSevice.saveEmployeeDetails(employee);

		return ResponseEntity.status(HttpStatus.CREATED).body(empl);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployeeDetails(@PathVariable Integer id,
			@RequestBody EmployeeRequestResponse employee) {
		Employee empl = employeeSevice.updateEmployeeDetails(id, employee);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(empl);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable Integer id) {
		employeeSevice.deleteEmployeeById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

}
