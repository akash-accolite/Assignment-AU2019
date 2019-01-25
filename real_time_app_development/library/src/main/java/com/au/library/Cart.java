package com.au.library;

public class Cart {

	private int id;
	private String title;
	private String author;
	
	public Cart(int id,String name,String author) {
		this.id=id;
		this.title=name;
		this.author=author;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

	
	
}
