package com.repuestos.JM.DTOS;

import lombok.Data;

@Data
public class CategoriaResponseDto {
    private String nombre;
    private String descripcion;
    
    // Constructores
    public CategoriaResponseDto() {}

    public CategoriaResponseDto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public CategoriaResponseDto(String nombre) {
        this.nombre = nombre;
    }
}
