package com.corso.java.bootVehicle.repository;

import com.corso.java.bootVehicle.domain.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {

}
