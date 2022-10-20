/*
 Program:	Q.WAP to  create Employee management using collections Perform operations:
				1.Add an employee, 2. Delete an employee, 3. Find an employee, 4. Display
 @Author :	SUBHADIP DAS
 Date	 :	20.10.2022
 */

package com.EmployeeManagementmodel;

// DECLARING BIN CLASS
public class Employee {

	private int id;
	private String name;
	private int salary;
	
	// DECLARING DEFAULT CONSTRUCTOR
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// DECLARING PARAMITAR CONSTRUCTOR
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	// USING GETTER & SETTER
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}// ENDING BIN CLASS
