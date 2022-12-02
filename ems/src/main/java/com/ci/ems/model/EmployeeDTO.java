package com.ci.ems.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmployeeDTO {

	int empid;
	String empName;
	String dateofJoining;
	String designation;
	String emailid;
	String joininglocation;
	String highestQualification;
	String workExperience;

public EmployeeDTO(int empid, String empName, String dateofJoining, String designation, String emailid,
		String joininglocation, String highestQualification, String workExperience) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.dateofJoining = dateofJoining;
	this.designation = designation;
	this.emailid = emailid;
	this.joininglocation = joininglocation;
	this.highestQualification = highestQualification;
	this.workExperience = workExperience;
}
}
