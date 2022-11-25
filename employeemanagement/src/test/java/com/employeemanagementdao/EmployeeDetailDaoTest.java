package com.employeemanagementdao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeDetailDaoTest {

	private EmployeeDetailDao dao;

	
	  @BeforeEach void init() { dao = new EmployeeDetailDao(); }
	 
	@Test
	void Salaryincremination() {
		double salary = dao.getEmployeeDetail(2).getSalary();

		assertEquals((salary + (salary * 0.1)), dao.incrementEmployeeSalary(2, 0.1));
	}
}
