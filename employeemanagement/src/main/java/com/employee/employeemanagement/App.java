package com.employee.employeemanagement;

import com.employeemanagementdao.EmployeeDao;
import com.employeemanagementdao.EmployeeDetailDao;
import com.employeemanagemententity.Employee;
import com.employeemanagemententity.EmployeeDetail;



public class App {
	public static void main(String[] args) {
		// creating two employee and details
		Employee employee = new Employee("Joy",12); // using employee constructor
		Employee employee1 = new Employee("SUBHO",26);// using employee constructor
		EmployeeDetail employeeDetail = new EmployeeDetail("KOLKATA", 556848); //using Employeedetail constructor
		EmployeeDetail employeeDetail1 = new EmployeeDetail("DELHI", 259975);//using Employeedetail constructor
		// updateing first name
		employee.setEmployeeName("RAM");
		   // employee1.setEmployeeFirstName("RAJU");
		
		employeeDetail.setEmployee(employee);
		employeeDetail1.setEmployee(employee1);
		employee.setEmployeeDetail(employeeDetail);
		employee1.setEmployeeDetail(employeeDetail1);

		EmployeeDao dao = new EmployeeDao(); // creating a object of EMPLOYEEDAO

		// for save data
		 dao.saveEmployee(employee);
		 dao.saveEmployee(employee1);
		 
		Employee e1 = dao.getEmployee(1);

		System.out.println(e1.getEmployeeName());
		 //e1.setEmployeeFirstName("soummoya");
		//empdao.deleteEmployee(1);

		EmployeeDetailDao emp = new EmployeeDetailDao();
		 emp.incrementEmployeeSalary(2,0.1);
		//emp.deleteEmployeeDetail(1);

	}
}
