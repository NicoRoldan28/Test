package com.example.test.repository;

import com.example.test.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, String> {

    List<Persona> findByDni(String dni);
}
