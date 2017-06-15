package com.mcs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAR_DETAILS")
public class Car implements Serializable{
	@GeneratedValue(strategy = GenerationType.AUTO)
    

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3528537578841284430L;
	


	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String model, String year, String color) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	
    @Id
    String model;
    
    String year;
    
    String color;
    
    String Sno;
    
    String Brandname;
    
	
	
	
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
		return "Car [model=" + model + ", year=" + year + ", color=" + color + ", Sno=" + Sno + ", Brandname="
				+ Brandname + "]";
	}

	
}
