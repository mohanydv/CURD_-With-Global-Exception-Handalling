
package com.mhn.poc.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eId;

	private String eName;
	private String eSalary;
	private Integer age;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="department_id")
	private Department department;
	
	
	public Employee(Integer eId, String eName, String eSalary, Integer age, Department department) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.age = age;
		this.department = department;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
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
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", age=" + age + ", department="
				+ department + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer eId, String eName, String eSalary, Integer age) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.age = age;
	}
	
	
	

}
