package Entities;

import Abstract.Entity;

public class Game implements Entity {

	private String name;
	private String detail;
	private double price;
	private int unitsInStock;
	
	public Game() {
		
	}
	
	public Game(String name, String detail, double price, int unitsInStock) {
		super();
		this.name = name;
		this.detail = detail;
		this.price = price;
		this.unitsInStock = unitsInStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
}
