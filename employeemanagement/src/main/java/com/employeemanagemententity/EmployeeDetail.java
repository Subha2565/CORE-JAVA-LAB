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
@Table(name = "employeeDetail")

// creating a pojo class
public class EmployeeDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// instans variables
	@Column(name = "id") // it will be displayed in database column name
	private int id;

	@Column(name = "address") // it will be displayed in database column name
	private String address;

	@Column(name = "email") // it will be displayed in database column name
	private String email;

	@Column(name = "salary") // it will be displayed in database column name
	private double salary;
	//creating relation between Employee and EmployeeDetail in onetoone connection 
	@OneToOne(mappedBy = "employeeDetail", cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_detail_id")
	private Employee employee;

	// generating default constructor
	public EmployeeDetail() {
		super();
	
	}

	// parameterized constructor

	public EmployeeDetail(String address, String email, double salary) {
		super();
		this.address = address;
		this.email = email;
		this.salary = salary;

	}

	// getter and setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	// to string method

	@Override
	public String toString() {
		return "EmployeeDetail [id=" + id + ", address=" + address + ", email=" + email + ", salary=" + salary
				+ ", employee=" + employee + "]";
	}

}// ending class
