package com.example.test.service;

import com.example.test.model.Persona;
import com.example.test.repository.PersonaRepository;
import com.example.test.repository.PetRepository;
import com.example.test.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

import static java.util.Objects.isNull;

@Service
public class PersonaService {


    private PersonaRepository personaRepository;
    private PetRepository petRepository;
    private VehicleRepository vehicleRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository, PetRepository petRepository,VehicleRepository vehicleRepository) {
        this.personaRepository = personaRepository;
        this.petRepository= petRepository;
        this.vehicleRepository= vehicleRepository;
    }

    public List<Persona> getAll(String dni) {
        if (isNull(dni)){
        return personaRepository.findAll();
    }
        return personaRepository.findByDni(dni);
    }

    public void add(Persona persona) {
        personaRepository.save(persona);
    }

}
