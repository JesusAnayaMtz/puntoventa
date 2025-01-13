package com.sistema.puntodeventa.mapper;

import com.sistema.puntodeventa.dto.ProductoDTO;
import com.sistema.puntodeventa.model.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    public ProductoDTO toDTO(Producto producto) {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setId(producto.getId());
        productoDTO.setDescripcion(producto.getDescripcion());
        productoDTO.setClaveSat(producto.getClaveSat());
        productoDTO.setIdCategoria(productoDTO.get());

    }
}
