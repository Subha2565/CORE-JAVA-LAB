/*
Program: SUM OF EVEN AND ODD ELIMENTS
@author: SUBHADIP DAS
@Date: 29th sep 2022
*/
package com.evenodd;

// declaring class
public class EvenOdd {
	// declaring method
	static void printArray(int[] ar) {

		int evenSum = 0, oddSum = 0; // taking staic variables and initialize 0

		for (int i = 0; i < 6; i++) // forloop
		{

			if (ar[i] % 2 == 0)// check if the number is even
			{
				evenSum += ar[i]; // evenSum= evenSum+ar[i]
			} else
				oddSum += ar[i]; // oddSum= oddSum+ar[i]

		} // end of forloop

		System.out.println("Sum of even elements:" + evenSum); // printing sum of even
		System.out.println("Sum of odd elements:" + oddSum); // printing sum of odd

	}// end of method

	// declaring main method
	public static void main(String... args) {

		int a[] = { 8, 4, 2, 7, 5, 9 };// declaring array

		printArray(a);// calling printArray method
	}// end of main method

}// end of class
