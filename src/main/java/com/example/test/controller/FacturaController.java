package com.example.test.controller;

import com.example.test.model.Factura;
import com.example.test.service.FacturaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factura")

public class FacturaController {

    FacturaService facturaService;

    @GetMapping()
    public List<Factura> getAll(){
        return facturaService.getAll();
    }

    @PostMapping("/")
    public void add(@RequestBody Factura factura){
        facturaService.add(factura);
    }
}
