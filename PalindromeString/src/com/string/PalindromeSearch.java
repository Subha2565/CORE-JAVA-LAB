/*
Program : Write a code to check a string is palindrome or not.	
@Author : Subhadip Das
@Date   : 06th Oct 2022
*/
package com.string;

import java.util.Scanner;

// Declaring a class
public class PalindromeSearch {

	// Declaring a method
	static boolean searchPalindrome(String str) {
		boolean status;
		// extract characters into an array from string
		char ch[] = str.toCharArray();
		String revers = ""; // empty string

		for (int i = ch.length - 1; i >= 0; i--) {
			revers = revers + ch[i];
		}
		int flag = str.compareTo(revers); // using compare method
		if (flag == 0)
			status = true;
		else
			status = false;

		return status;
	}// end of method

	// Declaring a main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // creating scanner object
		System.out.println("enter a string:");
		String s = sc.next();
		boolean search = searchPalindrome(s); // calling method
		if (search) {
			System.out.println("palindrome"); // printing
		} else
			System.out.println("not palindrome"); // printing

		sc.close();
	}// end of main method

}// end of class
