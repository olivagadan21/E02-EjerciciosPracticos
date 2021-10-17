package com.salesianostriana.dam.Ejer2E02.repo;

import com.salesianostriana.dam.Ejer2E02.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
