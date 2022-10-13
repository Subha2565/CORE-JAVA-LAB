/*
Program : LAB Q3. Create a Account and perform synchronized withdrawal in it using Threads			
@Author : Subhadip Das
@Date   : 10th OCT
*/
package com.ans3;

// creating a bin class

public class BankAccount {

	private int balance = 500;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {

		balance = balance - amount;
	}
} // ending of a class
