package com.salesianostriana.dam.Ejer2E02.repo;

import com.salesianostriana.dam.Ejer2E02.model.ProductoV2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductoV2Repository extends JpaRepository<ProductoV2, UUID> {
}
