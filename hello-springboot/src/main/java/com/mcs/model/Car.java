package com.mcs.model;

import java.io.Serializable;


public class Car implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3528537578841284430L;

	public Car(String model, String year, String color) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
	}

	String model;
	
	String year;
	
	String color;
	
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", color=" + color + "]";
	}
}
