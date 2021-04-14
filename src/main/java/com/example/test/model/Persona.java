package com.example.test.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;



@Data
@NoArgsConstructor
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "El campo Dni es obligatorio.")
    @Size(max = 8, message = "El campo Dni tiene como maximo 8 caracteres")
    private String dni;
    @NotNull(message = "El campo Nombre es obligatorio.")
    private String nombre;
    @NotNull(message = "El campo Apellido es obligatorio.")
    private String apellido;

    @OneToMany(fetch =FetchType.EAGER)
    @JoinColumn(name = "persona_id")
    private List<Vehicle>vehicles;


}
