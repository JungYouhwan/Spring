package com.yedam.app.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	private Integer employeeId;
	private String  firstName;
	private String  lastName;
	private String  email;
	private String  phoneNumber;
	@DateTimeFormat
	private Date    hireDate;
	private String  jobId;
	private Integer salary;
	private Integer commissionPct;
	private Integer managerId;
	private Integer departmentId;
	
	
}
