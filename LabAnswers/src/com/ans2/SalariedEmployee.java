
package com.ans2;

public class SalariedEmployee extends Employee {

	private int salary = 40000;

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int salary) {
		super();
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", getSalary()=" + getSalary() + ", toString()="
				+ super.toString();
	}

}
