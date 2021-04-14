package com.example.test.service;

import com.example.test.model.Pet;
import com.example.test.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;

@Service
public class PetService {

    private PetRepository petRepository;
    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository= petRepository;
    }

    public void addPet(Pet pet) {
        petRepository.save(pet);
    }

    public List getAll(Integer id) {
        if (isNull(id)){
            return petRepository.findAll();
        }
        return null;
    }
}
