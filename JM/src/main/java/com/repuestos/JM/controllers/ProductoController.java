package com.repuestos.JM.controllers;

import com.repuestos.JM.DTOS.ProductoDto;
import com.repuestos.JM.models.Producto;
import com.repuestos.JM.services.ProductosService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api") 
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {

    private final ProductosService productosService; 

    @PostMapping("/guardar")
    public ResponseEntity<Producto> guardarProducto(@RequestBody ProductoDto dto) {
        Producto productoGuardado = productosService.guardarProducto(dto);
        return ResponseEntity.ok(productoGuardado);
    }
    
}