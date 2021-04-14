package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor

public class Factura {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;
    private String nombreLocal;

    //@ManyToMany(mappedBy = "factura")
    //@JsonBackReference
    //private List<Producto> productoList;
    @ManyToMany(mappedBy = "facturas", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Producto> productoList;

    private Integer total;
}
