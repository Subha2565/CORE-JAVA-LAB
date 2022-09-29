package com.book;

// declaring a class
public class BookDetails {
	// declaring a method
	static void display(Book b) {

		System.out.println("BOOK SERIAL NO :" + b.getNoSi()); // printing serial number
		System.out.println("Name of the book :" + b.getName()); // printing book name
		System.out.println("Author name :" + b.getWriter()); // printing author name

	} // end of the method

	// Declaring Main method
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Book b1 = new Book(15, "The India Story", new Author("Bimal Jalan")); // calling paramiter constructure
		System.out.println("details are :"); // printing
		display(b1);// calling display method

	}// end of the main method

} // end of the class
