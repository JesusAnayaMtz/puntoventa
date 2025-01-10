package com.sistema.puntodeventa.service;


import com.sistema.puntodeventa.dto.CategoriaDTO;

import java.util.List;

public interface ICategoriaService {

    CategoriaDTO guardarCategora(CategoriaDTO categoriaDTO);
    List<CategoriaDTO> listarCategorias();

    CategoriaDTO obtenerCategoriaPorId(Long id);

    String desactivarCAtegoria(Long id);
}
