package com.sistema.puntodeventa.service;

import com.sistema.puntodeventa.dto.ProductoDTO;

import java.util.List;

public interface IProductoService {

    List<ProductoDTO> obtenerProductosActivos();

    List<ProductoDTO> obtenerTodosLosProductos();

    ProductoDTO crearProducto(ProductoDTO productoDTO);

    ProductoDTO actualizarProducto(Long id, ProductoDTO productoDTO);

    String eliminarProducto(Long id);
}
