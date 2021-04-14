package com.example.test.controller;

import com.example.test.model.Pet;
import com.example.test.model.Vehicle;
import com.example.test.service.PetService;
import com.example.test.service.VehicleService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pet")
@NoArgsConstructor

public class PetController {

    @Autowired
    PetService petService;

    @PostMapping("/")
    public void addPet(@RequestBody Pet pet){
        petService.addPet(pet);
    }
    @GetMapping
    public List getPet(Integer id){
        return petService.getAll(id);
    }


}
