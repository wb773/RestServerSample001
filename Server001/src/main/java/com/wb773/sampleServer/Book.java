package com.wb773.sampleServer;

public class Book {
	
	private long id;
	private String name;
	private double price;


	public Book(long id, String name, double price){
		setId(id);
		setName(name);
		setPrice(price);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
