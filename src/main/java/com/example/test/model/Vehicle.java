package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.AccessType;

import javax.persistence.*;



@Data
@NoArgsConstructor
@JsonTypeInfo(use= JsonTypeInfo.Id.NAME, property = "typeVehiculo", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value= Auto.class, name = "AUTO"),
        @JsonSubTypes.Type(value= Moto.class, name = "MOTO")
})
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Vehicle {
    @Id
    private Integer id;
    private Integer capacidad;
    private String color;

    @AccessType(AccessType.Type.PROPERTY)
    public abstract TypeVehicle typeVehiculo();

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    private Persona persona;


}
