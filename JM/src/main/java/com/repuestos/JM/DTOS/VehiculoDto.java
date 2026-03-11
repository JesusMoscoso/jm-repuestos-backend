package com.repuestos.JM.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data              
@NoArgsConstructor  
@AllArgsConstructor
public class VehiculoDto {
    private String marca;             
    private String modelo;            
    private Integer anio;             
    private String motor;             
    private String combustible;       
    private String transmision;       
    private String traccion;       
}