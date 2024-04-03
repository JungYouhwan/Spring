package com.yedam.java.emp.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	private Integer employeeId;
	private String lastNme;
	private String email;
	private Date hireDate;
	private String jobId;
}
