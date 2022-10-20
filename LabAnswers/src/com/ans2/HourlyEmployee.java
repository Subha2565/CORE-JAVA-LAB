package com.ans2;

public class HourlyEmployee extends Employee {
//	void salary2() {
//		System.out.println("hourly give 100");
//		System.out.println("hour");
//		Scanner sc = new Scanner(System.in);
//		int time = sc.nextInt();
//		int Salary = time * 100;
//		System.out.println("salary" + Salary);
//	}
	public int hSalary = 800;
	public int hour = 5;

	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(int id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(int hSalary, int hour) {
		super();
		this.hSalary = hour * hSalary;
		this.hour = hour;
	}

	public int gethSalary() {
		return hSalary;
	}

	public void sethSalary(int hSalary) {
		this.hSalary = hSalary;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hSalary=" + hSalary + ", hour=" + hour + ", gethSalary()=" + gethSalary() * getHour()
				+ ", getHour()=" + getHour() + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", toString()=" + super.toString();
	}

}
