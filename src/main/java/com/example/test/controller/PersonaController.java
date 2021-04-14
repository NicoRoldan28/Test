package com.example.test.controller;

import com.example.test.model.Persona;
import com.example.test.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping
    public List<Persona> getAll(@RequestParam(required = false) String dni) {
        return personaService.getAll(dni);
    }

    @PostMapping("/")
    public void addPersona(@RequestBody Persona persona) {
        personaService.add(persona);
    }



}
