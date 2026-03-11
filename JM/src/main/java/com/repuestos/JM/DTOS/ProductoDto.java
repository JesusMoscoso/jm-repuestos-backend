package com.repuestos.JM.DTOS;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  
@AllArgsConstructor
public class ProductoDto {
    private String codigo;
    private String nombre;
    private String imagen;
    private String marcaVehiculo;
    private Integer idCategoria;
    private Integer idProveedor;
    private String codigoOEM;
    private BigDecimal precio;
    private Integer stock = 0;
    private String descripcion;
    private Boolean esUniversal = false;
    private List<Integer> idsVehiculos;
}