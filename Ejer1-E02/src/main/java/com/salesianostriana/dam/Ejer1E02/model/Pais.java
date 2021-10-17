package com.salesianostriana.dam.Ejer1E02.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Pais implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String nombre;

    public Pais(@NonNull String nombre) {
        this.nombre = nombre;
    }
}
