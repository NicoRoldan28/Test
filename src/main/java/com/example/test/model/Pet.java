package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity

public class Pet {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;
    private String Name;
    private Integer kg;



}
