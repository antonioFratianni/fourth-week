package com.corso.java.bootVehicle.service;

import com.corso.java.bootVehicle.domain.Vehicle;
import com.corso.java.bootVehicle.repository.VehicleRepository;
import com.corso.java.bootVehicle.service.api.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    public Vehicle create(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

}
