package com.ProductManagement;

import java.util.Scanner;



public class App 
{
	// DECLARING MENU PRINTING METHOD
	public static void menu() {
		System.out.println("------------------------ MENU ----------------------");
		System.out.println("1. Add PRODUCT");
		System.out.println("2. Delete PRODUCT");
		System.out.println("3. Display PRODUCT");
		System.out.println("4. Exit");
       }// END OF THE MENU METHOD
	
	// DECLARING MAIN METHOD
	 public static void main( String[] args )
	    {
		 
		 // CREATING SCANNER OBJECT
		 Scanner sc = new Scanner(System.in);
		 
	    	//CREATEING OBJECT OF IMPL
	    	ProductDao em = new ProductImpl();
	    	
	    	// USE TRY-CATCH
	    	try {
	    		
	    	//DECLARING VARIABLE CHOICE	
	    	int ch=0;
	    	
	    	do {
	    		menu(); //CALLING MENU METHOD
	    		
	    		System.out.println("choose your choice-------->"); // PRINTING
	    		
	    		ch= sc.nextInt();  // TAKING INPUT FROM USER
	    		
	    		// DECLARING A SWITCH CASE
	    		switch(ch) {
	    			case 1:
	    					em.addEmployee();
	    					System.out.println(" inserted ");   // PRINTING
	    					break;
	    		}
}
	    	}
	    	
