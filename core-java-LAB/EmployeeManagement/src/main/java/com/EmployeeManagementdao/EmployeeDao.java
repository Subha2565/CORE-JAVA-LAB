package com.EmployeeManagementdao;

import com.EmployeeManagementmodel.Employee;

// DECLARING A INTERFACE
public interface EmployeeDao {
	
	void addEmployee();					// DECLARING addEmployee method
	boolean deleteEmployee(int id);     // DECLARING deleteEmployee method
	Employee searchEmployee(int id);    // DECLARING searchEmployee method
	void displayEmployeeList();         // DECLARING displayEmployee method
	

} // CLOSEING INTERFACE
