package com.startup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vehicle {
	
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String model;
	@Column
	private double price;
	@Column
	private String color;
	
	public Vehicle() {
		super();
	}
	public Vehicle(int id, String name, String model, double price, String color) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
		this.color = color;
	}
	public int getId() {
		return id;
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + ", price=" + price + ", color=" + color + "]";
	}
}
