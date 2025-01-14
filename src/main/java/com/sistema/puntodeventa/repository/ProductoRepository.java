package com.sistema.puntodeventa.repository;

import com.sistema.puntodeventa.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    Optional<Producto> findByDescripcion(String descripcion); // Buscar producto por descripción

    List<Producto> findByActivoTrue(); // Buscar todos los productos activos
}
