package com.sistema.puntodeventa.service;

import com.sistema.puntodeventa.CategoriaRepository;
import com.sistema.puntodeventa.dto.CategoriaDTO;
import com.sistema.puntodeventa.mapper.CategoriaMapper;
import com.sistema.puntodeventa.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private CategoriaMapper categoriaMapper;

    @Override
    public CategoriaDTO guardarCategora(CategoriaDTO categoriaDTO) {
        if(categoriaRepository.findbyNombre(categoriaDTO.getNombre()).isPresent()){
            throw new IllegalArgumentException("Ya existe Una Categoria Con Ese Nombre");
        }

        Categoria categoriaEntity = categoriaMapper.toEntity(categoriaDTO);

        categoriaEntity = categoriaRepository.save(categoriaEntity);

        return categoriaMapper.toDto(categoriaEntity);
    }

    @Override
    public List<CategoriaDTO> listarCategorias() {
        return List.of();
    }

    @Override
    public CategoriaDTO obtenerCategoriaPorId(Long id) {
        return null;
    }

    @Override
    public String desactivarCAtegoria(Long id) {
        return "";
    }
}
