package com.example.test.service;

import com.example.test.model.Factura;
import com.example.test.repository.FacturaRepository;

import java.util.List;

public class FacturaService {

    FacturaRepository facturaRepository;

    public List<Factura> getAll(){
        return facturaRepository.findAll();
    }

    public void add(Factura factura){
        facturaRepository.save(factura);
    }
}
