package com.yedam.java.emp.mapper;

import java.util.List;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	// 인터페이스는 빈에 등록이 안됨.
	
	public List<EmpVO> selectEmpAll();

}
