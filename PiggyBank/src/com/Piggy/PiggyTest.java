package com.Piggy;

import java.util.Scanner;

public class PiggyTest {

	static void balance(int p1) {

		System.out.println("initial value :" + p1.getIntialAmount() + "");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Piggy p = new Piggy();
		System.out.println("enter the amount :");
		p.Piggy(sc.nextInt());

	}

}
