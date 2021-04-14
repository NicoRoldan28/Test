package com.example.test.service;

import com.example.test.model.Persona;
import com.example.test.model.Producto;
import com.example.test.repository.PersonaRepository;
import com.example.test.repository.PetRepository;
import com.example.test.repository.ProductoRepository;
import com.example.test.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;

@Service
public class ProductoService {
    private ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
    this.productoRepository = productoRepository;
    }

    public List<Producto> getAll(Integer id) {
        //if (isNull(id)){
            return productoRepository.findAll();
        //}
        //return productoRepository.findByDni(dni);
    }

    public void add(Producto producto) {
        productoRepository.save(producto);
    }




}
