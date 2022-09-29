/*
Program: Aggregration of book and author
@author: SUBHADIP DAS
@Date: 29th sep 2022
*/
package com.book;

// declaring a bin class
public class Book {

	private int noSi;
	private String name;
	private Author writer;

	public Book() { // creating a default constructure
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int noSi, String name, Author writer) { // creating a peramiter constructure
		super();
		this.noSi = noSi;
		this.name = name;
		this.writer = writer;
	}

// declaring getter setter
	public int getNoSi() {
		return noSi;
	}

	public void setNoSi(int noSi) {
		this.noSi = noSi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getWriter() {
		return writer;
	}

	public void setWriter(Author writer) {
		this.writer = writer;
	}

} // end of the bin class
