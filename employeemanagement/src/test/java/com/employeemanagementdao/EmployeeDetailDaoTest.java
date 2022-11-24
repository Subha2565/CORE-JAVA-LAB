package com.employeemanagementdao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeDetailDaoTest {

	private EmployeeDetailDao empdao;

	@BeforeEach
	void init() {
		empdao = new EmployeeDetailDao();
	}

	@Test
	void incrementedSalary() {
		double oldSalary = empdao.getEmployeeDetail(3).getSalary();

		assertEquals((oldSalary + (oldSalary * 30 / 100)), empdao.incrementEmployeeSalary(3, 30));
	}
}
