package com.yedam.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpVO;

@SpringBootTest
class Boot240403ApplicationTests {
	@Autowired
	EmpMapper empMapper;
	
	//@Test
	void contextLoads() {
	}
	
	@Test
	void empAllList() {
		List<EmpVO> list = empMapper.selectEmpAll();
		assertTrue(!list.isEmpty()); // assertTrue = 지금 넘겨준게 트루인지 아닌지 체크
	}
	
	@Test
	void empInsert() {
		EmpVO empVO = new EmpVO();
		empVO.setLastName("Hong");
		empVO.setEmail("kdHong@goo.com");
		empVO.setJobId("IT_PROG");
		
		int result = empMapper.insertEmp(empVO);
		assertEquals(1, result);
	}
}
