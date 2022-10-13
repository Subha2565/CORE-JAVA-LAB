package com.ans4;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = null;
		;
		try {
			int ar[] = new int[3];
			System.out.println("enter numbers:");
			for (int i = 0; i <= 2; i++) {
				ar[i] = sc.nextInt();
			}

			try {

				System.out.println(s.length());

			} catch (NullPointerException n) {
				System.out.println(n);
			} finally {
				System.out.println("enter name:");
				String name = sc.next();
				s = s + name;
				System.out.println(name.length());

			}

		}

		catch (Exception e) {
			System.out.println(" Exception:" + e);
		}

		sc.close();
	}

}
