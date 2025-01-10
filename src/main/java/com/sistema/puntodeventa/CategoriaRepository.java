package com.sistema.puntodeventa;

import com.sistema.puntodeventa.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {

    Optional<Categoria> findbyNombre(String nombre);
}
