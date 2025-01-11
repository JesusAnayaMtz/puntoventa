package com.sistema.puntodeventa.controller;

import com.sistema.puntodeventa.dto.CategoriaDTO;
import com.sistema.puntodeventa.service.CategoriaServiceImpl;
import com.sistema.puntodeventa.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> listarCategorias() {
        return ResponseEntity.ok(categoriaService.listarCategorias());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarCategoriaPorId(@PathVariable Long id) {
        try {
            CategoriaDTO categoriaDTO = categoriaService.obtenerCategoriaPorId(id);
            return ResponseEntity.ok(categoriaDTO);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    private ResponseEntity<?> crearCategoria(@RequestBody CategoriaDTO categoriaDTO) {
        try {
            CategoriaDTO nuevaCategoria = categoriaService.guardarCategoria(categoriaDTO);
            return ResponseEntity.ok(nuevaCategoria);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarCategoria(@PathVariable Long id, @RequestBody CategoriaDTO categoriaDTO) {
       try {
           CategoriaDTO categoriaActualizada = categoriaService.actualizarCategoria(id, categoriaDTO);
           return ResponseEntity.ok(categoriaActualizada);
       } catch (RuntimeException e) {
           return ResponseEntity.badRequest().body(e.getMessage());
       }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarCategoria(@PathVariable Long id) {
        try {
            categoriaService.desactivarCategoria(id);
            return ResponseEntity.ok("Categoria Desactivada Correctamente");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
