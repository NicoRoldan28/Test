package com.example.test.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity

public class Moto extends Vehicle {

    @Override
    public TypeVehicle typeVehiculo(){
        return TypeVehicle.MOTO;
    }
}
