package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer precio;
    private Integer cantidad;

    @ManyToMany @JoinTable( name = "producto_x_factura",
            joinColumns = {@JoinColumn(name = "producto_id")},
            inverseJoinColumns = {@JoinColumn (name = "factura_id")} )

    /*@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "producto_x_factura",
            joinColumns = {@JoinColumn(name = "producto_id")},
            inverseJoinColumns = {@JoinColumn(name = "factura_id")}
    )*/
    private List<Factura> facturas;
}
