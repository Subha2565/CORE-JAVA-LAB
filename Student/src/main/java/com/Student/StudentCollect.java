package com.Student;

import java.util.HashMap;
import java.util.Scanner;

public class StudentCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, StudentsDetails > ccode = new HashMap<>();
		String student;
		
		Scanner sc = new Scanner(System.in);
		
		StudentsDetails cinfo =new StudentsDetails();
		
		ccode.put("1",new StudentsDetails("1","joy","BCA","50000","30000"));
		ccode.put("2",new StudentsDetails("2","JOHN","MCA","80000","70000"));
		ccode.put("3",new StudentsDetails("3","SUJOY","BCA","70000","50000"));
		ccode.put("4",new StudentsDetails("4","DIYA","BTECH","60000","20000"));
		ccode.put("5",new StudentsDetails("5","PUJA","MA","50000","10000"));
		
		System.out.println("student portal:");
		System.out.println("------------------");
		System.out.println("Enter the student:");
		student = sc.nextLine();

		// check : student is present in the map or not
		boolean status = ccode.containsKey(student);

		// displaying the information

		if (status) {
			System.out.println("----------------student information---------------------");
			cinfo = ccode.get(student);
			System.out.println(cinfo);

		}

		else {
			System.out.println("-----student not found----------");
		}

		// traversing list

//		for (Map.Entry<String, studentInformation> code : ccode.entrySet()) {
//
//		}

		sc.close();

	}
}


