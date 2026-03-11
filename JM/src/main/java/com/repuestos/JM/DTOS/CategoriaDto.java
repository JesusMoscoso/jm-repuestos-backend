package com.repuestos.JM.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  
@AllArgsConstructor
public class CategoriaDto {
    private String nombre;
    private String descripcion;
}
