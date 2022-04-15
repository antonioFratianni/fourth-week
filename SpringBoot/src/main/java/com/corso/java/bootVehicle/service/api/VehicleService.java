package com.corso.java.bootVehicle.service.api;

import com.corso.java.bootVehicle.domain.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAll();
    Vehicle create(Vehicle vehicle);
}
