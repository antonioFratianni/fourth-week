package com.corso.java.bootVehicle.controller;

import com.corso.java.bootVehicle.domain.Vehicle;
import com.corso.java.bootVehicle.service.api.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class VehicleController {

    @Autowired
    VehicleService vehicleServices;

    @GetMapping(path = "/vehicle")
    ResponseEntity <List<Vehicle>> getAll(){
        List<Vehicle> vehicles = vehicleServices.findAll();
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }

    @PostMapping(path="/vehicle")
    ResponseEntity<Vehicle> create(@RequestBody Vehicle vehicle){
        Vehicle vehicle1 = vehicleServices.create(vehicle);
        return new ResponseEntity<>(vehicle1, HttpStatus.OK);
    }
}
