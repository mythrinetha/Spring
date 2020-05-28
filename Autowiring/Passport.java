package com.spring.app;

import java.util.Date;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.spring.app")
public class Passport 
{
	@Value("1010")
	private int passNum;
	@Value("#{new java.text.SimpleDateFormat(\"yyyyMMdd\").parse(\"20190202\")}")
	private Date dateOfIssue;
	@Value("#{new java.text.SimpleDateFormat(\"yyyyMMdd\").parse(\"20190909\")}")
	private Date dateOfExpiry;
	
	public int getPassNum() {
		return passNum;
	}
	public void setPassNum(int passNum) {
		this.passNum = passNum;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
}
