package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.spring.app")
public class Employee 
{
	@Value("10")
	private int empId;
	@Value("NameXYZ")
	private String empName;
	@Autowired
	private Passport passObj;
	
	public  int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public  String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public  Passport getPassObj() {
		return passObj;
	}
	public void setPassObj(Passport passObj) {
		this.passObj = passObj;
	}
}
