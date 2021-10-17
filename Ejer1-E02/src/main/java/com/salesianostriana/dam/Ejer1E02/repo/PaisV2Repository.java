package com.salesianostriana.dam.Ejer1E02.repo;

import com.salesianostriana.dam.Ejer1E02.model.PaisV2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaisV2Repository extends JpaRepository<PaisV2, UUID> {
}
