/*
Program : LAB Q2. Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee  and functionality . Create a test class				
@Author : Subhadip Das
@Date   : 10th OCT
*/
package com.ans2;

// declaring bin class
public class Employee {
	private int id;
	private String name;
	private int age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// using getter setter
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}// end of the class
