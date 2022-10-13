package com.ans2;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedEmployee employee1 = new SalariedEmployee(102, "Sujoy", 45);
		System.out.println(employee1);

		HourlyEmployee employee2 = new HourlyEmployee(104, "Dipa", 33);
		System.out.println(employee2);
	}

}
