package com.sistema.puntodeventa.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CategoriaDTO {

    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCreacion;
    private boolean activo;
}
