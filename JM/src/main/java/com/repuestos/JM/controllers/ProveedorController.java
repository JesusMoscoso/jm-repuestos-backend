package com.repuestos.JM.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.repuestos.JM.models.Proveedor;
import com.repuestos.JM.services.ProveedorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api") 
@CrossOrigin(origins = "http://localhost:4200")
public class ProveedorController {
    
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("proveedores")
    public List<Proveedor> listarProveedores() {
        return proveedorService.listarProveedores();
    }


}
