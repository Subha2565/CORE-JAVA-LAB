package com.book;

// declaring a class
public class Author {

	private String name;

	public Author() { // creating a default constructure
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String name) {// creating a peramiter constructure
		super();
		this.name = name;
	}

// declaring getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[Author Name=" + name + "]";
	}

}// end of the class
