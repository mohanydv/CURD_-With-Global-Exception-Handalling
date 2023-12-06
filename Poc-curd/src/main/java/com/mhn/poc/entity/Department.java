package com.mhn.poc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	@Id

	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer deptID;

	private String deptName;

	public Integer getDeptID() {
		return deptID;
	}

	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}

	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptName=" + deptName + "]";
	}

	
	public Department(Integer deptID, String deptName) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}
