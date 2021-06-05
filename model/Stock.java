package com.oopsProblems.model;

public class Stock {
	
	private int id;
	private String name;
	private int weight;
	private double price;
	
	//Constructor
	public Stock(int id, String name, int weight, double price){
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	public Stock() {
		
	}
	//Standard Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return name;
	}
	public void setProductName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
