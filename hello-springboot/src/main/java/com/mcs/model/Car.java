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
	
    

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3528537578841284430L;
	


	public Car() {
		super();
	}
	
	
	public Car(String brand, String model, String year, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
	}


	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long serial;
    
	String brand;
    
    String model;
    
    String year;
    
    String color;



	public Long getSerial() {
		return serial;
	}

	public void setSerial(Long serial) {
		this.serial = serial;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

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
		return "Car [serial=" + serial + ", brand=" + brand + ", model=" + model + ", year=" + year + ", color=" + color
				+ "]";
	}
    
  
}
