package com.mcs.service;

import java.util.List;

import com.mcs.model.Car;

public interface IExcelReader {
	
	public List<Car> readFile(byte[] file) throws Exception;

}
