/*
 Program : Compare string builder and string Buffer using performance test		
@Author :  Subhadip Das
@Date   :  06th Oct 2022
 */
package com.test;

// Taking a class
public class TestingPerformance {

	// Declaring a main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long strTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("SUBHADIP");

		for (int i = 0; i < 1000000; i++) {
			sb.append('t');
		}

		long takeTime = System.currentTimeMillis() - strTime;

		System.out.println("Time for StringBuffer:" + takeTime); // printing

		strTime = System.currentTimeMillis();

		StringBuilder sb1 = new StringBuilder("SUBHADIP");

		for (int i = 0; i < 1000000; i++) {
			sb1.append('t');
		}

		takeTime = System.currentTimeMillis() - strTime;

		System.out.println("Time for StringBuilder:" + takeTime); // printing

	}// end of the main method

} // end of the class
