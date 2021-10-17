package com.salesianostriana.dam.Ejer1E02.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter @Setter
@AllArgsConstructor
@Builder
public class PaisV2 {

    @Id
    private UUID id;

    @NonNull
    private String nombre;

    public PaisV2(@NonNull String nombre) {
        this.nombre = nombre;
    }
}
