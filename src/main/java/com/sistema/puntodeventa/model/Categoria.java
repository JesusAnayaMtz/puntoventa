package com.sistema.puntodeventa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(length = 255)
    private String descripcion;

    @Column(nullable = false, updatable = false)
    private LocalDate fechaCreacion;

    @Column(nullable = false)
    private Boolean activo = true;


    @PrePersist
    public void prePersist() {
        this.fechaCreacion = LocalDate.now();
    }
}
