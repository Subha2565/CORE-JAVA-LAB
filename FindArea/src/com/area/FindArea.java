/*
 Program : Finding areas		
@Author :  Subhadip Das
@Date   :  06th Oct 2022
 */
package com.area;

import java.util.Scanner;

public class FindArea {

	public static double AreaOfRectangle(float length, float breath) {
		return length * breath;

	}

	public static double AreaOfSquare(double sides) {
		return sides * sides;
	}

	public static double AreaOfCircle(double rads) {
		return 3.14 * rads * rads;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of rectangle:");
		float length = sc.nextFloat();

		System.out.println("Enter the breath of rectangle:");
		float breath = sc.nextFloat();

		System.out.println("Enter the side of square:");
		double side = sc.nextFloat();

		System.out.println("Enter the radius of circle:");
		double rads = sc.nextFloat();

		double areaofreactangle = AreaOfRectangle(length, breath);
		System.out.println("area of rectangle:" + areaofreactangle);

		double areaofsquare = AreaOfSquare(side);
		System.out.println("area of square:" + areaofsquare);

		double areaofcircle = AreaOfCircle(rads);
		System.out.println("area of circle:" + areaofcircle);
	}
}
