package com.example.test.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity

public class Auto extends Vehicle {
    private Integer puertas;

    @Override
    public TypeVehicle typeVehiculo(){
        return TypeVehicle.AUTO;
    }
}
