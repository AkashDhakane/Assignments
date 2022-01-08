package com.app.library;

import java.time.LocalDate;

import enums.Category;

public class Book {
	private String title;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int quantity;
	private Category category;
	
	
	
	public Book(String title, double price, String publishDate, String authorName, int quantity, String catgry) {
		super();
		Category c = Category.valueOf(catgry);
		LocalDate d = LocalDate.parse(publishDate);
		this.title = title;
		this.price = price;
		this.publishDate = d;
		this.authorName = authorName;
		this.quantity = quantity;
		this.category = c;
	}



	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", publishDate=" + publishDate + ", authorName="
				+ authorName + ", quantity=" + quantity + ", category=" + category + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("in Book's equal");
		if(o instanceof Book) {
			Book b=(Book) o;
			return (this.title).equals(b.title);
		}else {
			return false;
		}
	}
	
	public String getTitle() {
		return title;
	}



	public double getPrice() {
		return price;
	}



	public LocalDate getPublishDate() {
		return publishDate;
	}



	public String getAuthorName() {
		return authorName;
	}



	public int getQuantity() {
		return quantity;
	}



	public Category getCategory() {
		return category;
	}



	@Override
	public int hashCode() {
		System.out.println("in hashCode");
		return title.hashCode();
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
	
}
