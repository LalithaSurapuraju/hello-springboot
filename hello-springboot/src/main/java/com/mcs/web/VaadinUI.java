package com.mcs.web;

import org.springframework.beans.factory.annotation.Autowired;

import com.mcs.jpa.CarRepository;
import com.mcs.model.Car;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class VaadinUI extends UI{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5195770179486534753L;

	/* (non-Javadoc)
	 * @see com.vaadin.ui.UI#init(com.vaadin.server.VaadinRequest)
	 */
	
	@Autowired
	CarRepository carRepo;
	
	private Grid<Car> grid = new Grid(Car.class);
	
	
	@Override
	protected void init(VaadinRequest request) {
		
		
		grid.setItems(carRepo.findAll());
		VerticalLayout verticalLayout = new VerticalLayout(grid);
		
		setContent(verticalLayout);
	}
	
	
}