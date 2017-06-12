package com.mcs.model;

import java.io.Serializable;


public class Car implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3528537578841284430L;
	


	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String model, double year, String color) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	

	String model;
	
	double year;
	
	String color;
	
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
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
