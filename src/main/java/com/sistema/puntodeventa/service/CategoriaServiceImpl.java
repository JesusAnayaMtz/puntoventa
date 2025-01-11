package com.sistema.puntodeventa.service;

import com.sistema.puntodeventa.mapper.CategoriaMapper;
import com.sistema.puntodeventa.repository.CategoriaRepository;
import com.sistema.puntodeventa.dto.CategoriaDTO;
import com.sistema.puntodeventa.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private CategoriaMapper categoriaMapper;


    @Override
    public CategoriaDTO guardarCategoria(CategoriaDTO categoriaDTO) {
        if(categoriaRepository.findCategoriaByNombre(categoriaDTO.getNombre()).isPresent()){
            throw new RuntimeException("La categoria con el nombre " + categoriaDTO.getNombre() + " ya existe");
        }

        Categoria categoria = categoriaMapper.toEntity(categoriaDTO);
        categoriaRepository.save(categoria);
        return categoriaMapper.toDTO(categoria);
    }

    @Override
    public List<CategoriaDTO> listarCategorias() {
        return categoriaRepository.findAll().stream().map(categoriaMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public CategoriaDTO obtenerCategoriaPorId(Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
        return categoriaMapper.toDTO(categoria);
    }

    @Override
    public void desactivarCategoria(Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow(() -> new RuntimeException("Categoria no encontrada"));

        categoria.setActivo(false);
        categoriaRepository.save(categoria);
    }

    @Override
    public CategoriaDTO actualizarCategoria(Long id, CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaRepository.findById(id). orElseThrow(() -> new RuntimeException("Categoria no encontrada"));

        categoria.setNombre(categoriaDTO.getNombre());
        categoria.setDescripcion(categoriaDTO.getDescripcion());
        categoriaRepository.save(categoria);
        return categoriaMapper.toDTO(categoria);
    }
}
