package com.sistema.puntodeventa.service;

import com.sistema.puntodeventa.dto.ProductoDTO;
import com.sistema.puntodeventa.mapper.ProductoMapper;
import com.sistema.puntodeventa.repository.CategoriaRepository;
import com.sistema.puntodeventa.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ProductoMapper productoMapper;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<ProductoDTO> obtenerProductosActivos() {
        return productoRepository.findByActivoTrue().stream().map(productoMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<ProductoDTO> obtenerTodosLosProductos() {
        return productoRepository.findAll().stream().map(productoMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        return null;
    }

    @Override
    public ProductoDTO actualizarProducto(Long id, ProductoDTO productoDTO) {
        return null;
    }

    @Override
    public String eliminarProducto(Long id) {
        return "";
    }
}
