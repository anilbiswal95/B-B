package com.startup.dao;

import org.springframework.data.repository.CrudRepository;

import com.startup.model.Vehicle;

public interface VehicleRepo extends CrudRepository<Vehicle, Integer> {

}
