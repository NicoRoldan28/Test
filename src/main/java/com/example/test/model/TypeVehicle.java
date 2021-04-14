package com.example.test.model;

public enum TypeVehicle {
    MOTO("Motocicleta"),
    AUTO("Auto");

    private String descripcion;


    TypeVehicle(String descripcion) {
        this.descripcion = descripcion;
    }

    public static TypeVehicle find(String descripcion) {
        for (TypeVehicle v : values()) {
            if (values().toString().equalsIgnoreCase(descripcion)) {
                return v;
            }
        }
        throw new IllegalArgumentException(String.format("Invalid TypeVehiculo: %s", descripcion));
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
