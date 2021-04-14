package com.example.test.service;

import com.example.test.model.Vehicle;
import com.example.test.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public void addVehicle(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

}
