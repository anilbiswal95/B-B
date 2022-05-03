package com.startup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.startup.model.Vehicle;
import com.startup.service.BusinessLogic;

@RestController
public class BnBController{

	Vehicle vehicle;
	@Autowired
	BusinessLogic service;
	
	@GetMapping("/view")
	public List<Vehicle> findAll()
	{
		return service.FindAll();
	}
	
	@PostMapping("/add")
	public void addItem(@RequestBody Vehicle vehicle)
	{
		service.add(vehicle);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Vehicle> updateItem(@PathVariable int id, @RequestBody Vehicle vehicle)
	{
		return service.update(id,vehicle);
	}
	
	@DeleteMapping("/del/{id}")
	public void deleteItemByID(@PathVariable int id)
	{
		service.delete(id);
	}
}
