package com.example.test.repository;

import com.example.test.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

}
