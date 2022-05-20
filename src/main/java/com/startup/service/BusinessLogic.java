package com.startup.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	
	public ResponseEntity<Vehicle> update(int id, Vehicle vehicle)
	{
		Optional<Vehicle> nullCheck=vehicleRepo.findById(id);
		if (nullCheck.isPresent()) {
			vehicle=nullCheck.get();
			vehicle.setModel("New");
		}
		return new ResponseEntity<>(vehicleRepo.save(vehicle), HttpStatus.OK);
			
	}  
	
	
	public void delete(int id)
	{
		vehicleRepo.deleteById(id);
	}
}
