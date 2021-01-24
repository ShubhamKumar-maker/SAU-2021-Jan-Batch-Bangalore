package com.au.hibernate.assignment;

public class Book {
	private int id;
	private String name;
	private String author;
	private int isbnCode;
	public int getId() {
		return id;
	}
	public Book()
	{
		
	}
	
	public Book(String name, String author, int isbnCode) {
		super();
		this.name = name;
		this.author = author;
		this.isbnCode = isbnCode;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbnCode() {
		return isbnCode;
	}
	public void setIsbnCode(int isbnCode) {
		this.isbnCode = isbnCode;
	}

}
