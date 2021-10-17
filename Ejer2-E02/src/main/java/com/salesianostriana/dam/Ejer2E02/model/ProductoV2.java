package com.salesianostriana.dam.Ejer2E02.model;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Getter @Setter
@Builder

public class ProductoV2 implements Serializable{

    @Id
    private UUID id;

    @NaturalId
    private String nombre;

    @NaturalId
    private double precio;

    private String imagen;

    private String descripcion;

    public ProductoV2(String nombre, double precio, String imagen, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }
}
