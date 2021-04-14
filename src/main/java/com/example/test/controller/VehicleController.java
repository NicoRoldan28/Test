package com.example.test.controller;

import com.example.test.model.Vehicle;
import com.example.test.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    /*public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }*/

    @PostMapping
    public void addVehicle(@RequestBody Vehicle vehicle){
        vehicleService.addVehicle(vehicle);
    }




}
