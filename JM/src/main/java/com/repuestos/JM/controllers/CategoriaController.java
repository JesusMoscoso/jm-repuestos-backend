package com.repuestos.JM.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repuestos.JM.DTOS.CategoriaDto;
import com.repuestos.JM.models.Categoria;
import com.repuestos.JM.models.Vehiculo;
import com.repuestos.JM.services.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categorias") 
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    //obtener las categorias
    @GetMapping("/listar")
    public List<Categoria> listarCategorias() {
        return categoriaService.obtenerCategorias();
    }

    //guardar la categoria
    @PostMapping("/guardar")
    public ResponseEntity<Categoria> guardarCategoria(@RequestBody CategoriaDto dto) {
        Categoria categoriaGuardada = categoriaService.guardarCategoria(dto);
        return ResponseEntity.ok(categoriaGuardada);
    }

    
    

}
