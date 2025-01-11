package com.sistema.puntodeventa.service;


import com.sistema.puntodeventa.dto.CategoriaDTO;

import java.util.List;

public interface ICategoriaService {

    CategoriaDTO guardarCategoria(CategoriaDTO categoriaDTO);

    List<CategoriaDTO> listarCategorias();

    CategoriaDTO obtenerCategoriaPorId(Long id);

    void desactivarCategoria(Long id);

    CategoriaDTO actualizarCategoria(Long id, CategoriaDTO categoriaDTO);
}
