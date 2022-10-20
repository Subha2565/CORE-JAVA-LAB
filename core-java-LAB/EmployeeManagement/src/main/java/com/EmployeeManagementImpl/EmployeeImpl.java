package com.EmployeeManagementImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.EmployeeManagementdao.EmployeeDao;
import com.EmployeeManagementmodel.Employee;

public class EmployeeImpl implements EmployeeDao {
	
List<Employee> employeeList = new ArrayList<Employee>(); // CREATING A ARRAY OF EMPLOYEE
	

	// CREATING A SCANNER OBJECT
	Scanner sc = new Scanner(System.in);
	
	//CALLING ADD METHOD
	public void addEmployee() {
		
		// CREATING A EMPLOYEE OBJECT
		Employee e1= new Employee();
		
		// TODO Auto-generated method stub
		System.out.println("Enter the id:"); // PRINTING
		e1.setId(sc.nextInt());// TAKING INPUT FROM USER
		
		System.out.println("Enter the name:");  // PRINTING
		e1.setName(sc.next());// TAKING INPUT FROM USER
		
		System.out.println("Enter the Salary:");  // PRINTING
		e1.setSalary(sc.nextInt());// TAKING INPUT FROM USER
		
		employeeList.add(e1); // ADDING IN ARRAY
		System.out.println(employeeList); // PRINTING
		
	}//  END OF THE ADD METHOD
	
	
	// CALLING DELETE METHOD
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		
		//  CREATING A EMPLOYEE OBJECT
		Employee edelete = null;
		for(Employee e1: employeeList)    // TREVERSING ARRAY
		{
			if(e1.getId()==id)
				edelete= e1;
		}
		
		if(edelete == null)
			status = false;
		else {
			employeeList.remove(edelete);
			status = true;
		}
		
		return status;
		
	}// END OF THE DELETE METHOD
	
	// CALLING SEARCH METHOD
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		
		Employee esearch = null;  // CREATING A EMPLOYEE OBJECT
		// finding the student
		for (Employee e1 : employeeList) {  // TREVERSING ARRAY
			if (e1.getId() == id)
				esearch = e1;
		} // END OF THE FORLOOP

		return esearch;
	}// END OF SEARCH METHOD
	
	
	//CALLING DISPLAY METHOD
	public void displayEmployeeList() {
		// TODO Auto-generated method stub
		
		for (Employee e1 : employeeList) { // TREVERSING ARRAY
			System.out.println(e1);  // PRINTING
			
		} // END OF THE FORLOOP
		
	}// END OF DISPLAY METHOD
	
} // END OF THE CLASS



