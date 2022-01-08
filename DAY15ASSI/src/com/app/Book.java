package com.app;

import java.time.LocalDate;

public class Book {
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private String title;
	private Category x;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int quantity;

	public Book(String title, Category x, double price, LocalDate publishDate, String authorName, int quantity) {
		super();
		this.title = title;
		this.x = x;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", x=" + x + ", price=" + price + ", publishDate=" + publishDate
				+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Book) {
			return title.equals(((Book) o).title);

		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return 17*(title.hashCode()+title.hashCode());		
	}

}
