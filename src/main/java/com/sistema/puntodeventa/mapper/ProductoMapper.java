package com.sistema.puntodeventa.mapper;

import com.sistema.puntodeventa.dto.ProductoDTO;
import com.sistema.puntodeventa.model.Categoria;
import com.sistema.puntodeventa.model.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    public ProductoDTO toDTO(Producto producto) {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setId(producto.getId());
        productoDTO.setDescripcion(producto.getDescripcion());
        productoDTO.setClaveSat(producto.getClaveSat());
        productoDTO.setIdCategoria(producto.getCategoria().getIdCategoria());
        productoDTO.setUnidadVenta(producto.getUnidadVenta());
        productoDTO.setStock(producto.getStock());
        productoDTO.setStockMax(producto.getStockMax());
        productoDTO.setStockMin(producto.getStockMin());
        productoDTO.setPrecio(producto.getPrecio());
        productoDTO.setImagen(producto.getImagen());
        productoDTO.setActivo(producto.isActivo());
        return productoDTO;
    }

    public Producto toProducto(ProductoDTO productoDTO, Categoria categoria) {
        Producto producto = new Producto();
        producto.setId(productoDTO.getId());
        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setClaveSat(productoDTO.getClaveSat());
        producto.setCategoria(categoria);
        producto.setUnidadVenta(productoDTO.getUnidadVenta());
        producto.setStock(productoDTO.getStock());
        producto.setStockMax(productoDTO.getStockMax());
        producto.setStockMin(productoDTO.getStockMin());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setImagen(productoDTO.getImagen());
        producto.setActivo(productoDTO.isActivo());
        return producto;
    }
}
