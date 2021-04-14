package com.example.test.controller;

import com.example.test.model.Producto;
import com.example.test.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")

public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    public List<Producto> getAll(@RequestParam(required = false) Integer id) {
        return productoService.getAll(id);
    }

    @PostMapping("/")
    public void add(@RequestBody  Producto producto){
        productoService.add(producto);
    }



}
