package com.ci.ems.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmployeeDTO {

	@Id int empid;
	String empName;
	String dateofJoining;
	String designation;
	String emailid;
	String joininglocation;
	String highestQualification;
	String workExperience;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDateofJoining() {
		return dateofJoining;
	}
	public void setDateofJoining(String dateofJoining) {
		this.dateofJoining = dateofJoining;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getJoininglocation() {
		return joininglocation;
	}
	public void setJoininglocation(String joininglocation) {
		this.joininglocation = joininglocation;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public String getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}


}
