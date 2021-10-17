package com.salesianostriana.dam.Ejer2E02.model;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Producto implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NaturalId
    private String nombre;

    @NaturalId
    private double precio;

    private String imagen;

    private String descripcion;

}
