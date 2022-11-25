/*
 @AUTHOR - SUBHADIP DAS
 @DATE -24.11.2022
 LAB QUESTION

 */
package com.employeemanagemententity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")

//creating a pojo class
public class Employee {

	// creating instances and making database table
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// auto generate of id
	@Column(name = "Id") // it will be displayed in database column name
	private int id;

	@Column(name = "EmployeeName") // it will be displayed in database column name
	private String employeeName;
	
	@Column(name = "EmployeeAge") // it will be displayed in database column name
	private int employeeAge;

	// giving relation between tables
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	private EmployeeDetail employeeDetail;

	// Default constructor
	public Employee() {
		super();
		
	}

	// Parameterized contructor
	public Employee(String employeeName, int employeeAge) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}

	// Generating getter setter
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public EmployeeDetail getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(EmployeeDetail employeeDetail) {
		this.employeeDetail = employeeDetail;
	}

	// generating To String method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge + ", employeeDetail=" + employeeDetail + "]";
	}

}// end class
