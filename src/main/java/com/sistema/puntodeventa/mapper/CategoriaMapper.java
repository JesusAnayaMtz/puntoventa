package com.sistema.puntodeventa.mapper;

import com.sistema.puntodeventa.dto.CategoriaDTO;
import com.sistema.puntodeventa.model.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    CategoriaDTO toDto(Categoria categoria);


    Categoria toEntity(CategoriaDTO categoriaDTO);
}
