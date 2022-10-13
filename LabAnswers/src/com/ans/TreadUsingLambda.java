/*
Program : LAB Q1. Create a Thread using Lambda .		
@Author : Subhadip Das
@Date   : 10th OCT
*/
package com.ans;

// Declaring class
public class TreadUsingLambda {

	// Declaring main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread with lambda

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " :thread is running sucessfully");

			}

		};

		Thread t1 = new Thread(r1, "Joy");

		t1.start();
		System.out.println("*****   Without Lambda  ******");// printing

		// Thread with lambda

		Runnable r2 = () -> {
			System.out.println(Thread.currentThread().getName() + " :thread is running sucessfully");
		};

		Thread t2 = new Thread(r2, "Subho");
		System.out.println("******  With Lambda  ******"); // printing
		t2.start();

	} // end of main method
} // end of the class
