package com.startup.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.dao.VehicleRepo;
import com.startup.model.Vehicle;

@Service
public class BusinessLogic {
	
	@Autowired
	VehicleRepo vehicleRepo;

	public List<Vehicle> FindAll()
	{
		List<Vehicle> vehicle = new ArrayList<Vehicle>();  
		vehicleRepo.findAll().forEach(vehicle1 -> vehicle.add(vehicle1));  
		return vehicle;  
	}
	
	public void add(Vehicle vehicle)
	{
		vehicleRepo.save(vehicle);
	}
	
	public String update()
	{
		return "";
	}
	
	public String delete()
	{
		return "";
	}
}
