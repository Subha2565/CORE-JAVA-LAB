/*
Program: create a array of 10 students and display the students who have marks more than 90

@author: SUBHADIP DAS
@Date: 21 sept 2022
*/
import java.util.*;

  class Student
  {
    private String name; 
	private int roll;
	private int marks;
	
	 void createStudent()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the name:");
		name=sc.next();
		
		System.out.println("Enter the roll:");
		roll=sc.nextInt();
		
		System.out.println("Enter the marks:");
		marks=sc.nextInt();
		
		
		
		System.out.println("Student added successfully");
	}
	
	
	void displayStudent()
	{
		if(marks>90)
		{
			System.out.println("name:" + name);
			System.out.println("roll :"+roll);
			System.out.println("marks :"+marks);
		}
	}
	
  }
  
