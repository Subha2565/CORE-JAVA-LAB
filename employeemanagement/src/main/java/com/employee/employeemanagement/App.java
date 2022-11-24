package com.employee.employeemanagement;

import com.employeemanagementdao.EmployeeDao;
import com.employeemanagementdao.EmployeeDetailDao;
import com.employeemanagemententity.Employee;
import com.employeemanagemententity.EmployeeDetail;



public class App {
	public static void main(String[] args) {
		// Save two employee
		Employee employee = new Employee("Joy", "Roy", 12); // using employee constructor
		EmployeeDetail employeeDetail = new EmployeeDetail("KOLKATA", "JOU2565@GMAIL.COM", 556848); //using Employeedetail constructor
		employee.setEmployeeFirstName("RAM");
		employeeDetail.setEmployee(employee);
		employee.setEmployeeDetail(employeeDetail);

		Employee employee1 = new Employee("SUBHO", "DAS", 26);// using employee constructor
		EmployeeDetail employeeDetail1 = new EmployeeDetail("DELHI", "SUBHO2565@GMAIL.COM", 259975);//using Employeedetail constructor
		// employee1.setEmployeeFirstName("RAJU");
		employeeDetail1.setEmployee(employee1);
		employee1.setEmployeeDetail(employeeDetail1);

		EmployeeDao empdao = new EmployeeDao();

		// for save data
		// empdao.saveEmployee(employee);
		// empdao.saveEmployee(employee1);
		Employee e1 = empdao.getEmployee(3);

		System.out.println(e1.getEmployeeFirstName());
		// e1.setEmployeeFirstName("Sixense");
		empdao.deleteEmployee(4);

		EmployeeDetailDao emp = new EmployeeDetailDao();
		// emp.incrementEmployeeSalary(2, 30);
		emp.deleteEmployeeDetail(4);

	}
}
