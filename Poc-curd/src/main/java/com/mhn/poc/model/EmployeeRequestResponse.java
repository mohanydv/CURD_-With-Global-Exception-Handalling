package com.mhn.poc.model;

import com.mhn.poc.entity.Department;


public class EmployeeRequestResponse {

	
	private String eName;
	private String eSalary;
	private Integer age;
	
	private Department department;
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteSalary() {
		return eSalary;
	}
	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eSalary=" + eSalary + ", age=" + age + ", department="
				+ department + "]";
	}
	
	
	public EmployeeRequestResponse() {
		super();
	}
	public EmployeeRequestResponse(String eName, String eSalary, Integer age, Department department) {
		super();
		this.eName = eName;
		this.eSalary = eSalary;
		this.age = age;
		this.department = department;
	}
	}
	
