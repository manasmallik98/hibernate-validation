package com.manas.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
@Entity
@Table
public class Employee {
	@Id
	@Min(value=2)
	private int employeeId;
	@Size(min=5,max=10)
	private String employeeName;
	@NotNull
	private long employeeMobileNo;
	@Email
	@NotNull
	private String employeeEmailId;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, long employeeMobileNo, String employeeEmailId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMobileNo = employeeMobileNo;
		this.employeeEmailId = employeeEmailId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public long getEmployeeMobileNo() {
		return employeeMobileNo;
	}
	public String getEmployeeEmailId() {
		return employeeEmailId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setEmployeeMobileNo(long employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}
	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeMobileNo="
				+ employeeMobileNo + ", employeeEmailId=" + employeeEmailId + "]";
	}
	
}
