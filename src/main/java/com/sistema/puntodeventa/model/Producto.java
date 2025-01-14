package com.sistema.puntodeventa.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

import java.time.LocalDate;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    private int claveSat;

    private UnidadVenta unidadVenta;

    @ManyToOne
    @JoinColumn(name = "categoria_id_categoria")
    private Categoria categoria;

    private int stock;
    private int stockMax;
    private int stockMin;

    private LocalDate fechaCreacion;

    private LocalDate fechaModificacion;

    private double precio;
    private String imagen;

    private boolean activo = true;

    public Producto() {
    }

    @PrePersist
    public void prePersist() {
        this.fechaCreacion = LocalDate.now();
    }

    public Producto(Long id, String descripcion, int claveSat, UnidadVenta unidadVenta, Categoria categoria, int stock, int stockMax, int stockMin, LocalDate fechaCreacion, LocalDate fechaModificacion, double precio, String imagen, boolean activo) {
        this.id = id;
        this.descripcion = descripcion;
        this.claveSat = claveSat;
        this.unidadVenta = unidadVenta;
        this.categoria = categoria;
        this.stock = stock;
        this.stockMax = stockMax;
        this.stockMin = stockMin;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.precio = precio;
        this.imagen = imagen;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getClaveSat() {
        return claveSat;
    }

    public void setClaveSat(int claveSat) {
        this.claveSat = claveSat;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public UnidadVenta getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(UnidadVenta unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMax() {
        return stockMax;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = LocalDate.now();
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
