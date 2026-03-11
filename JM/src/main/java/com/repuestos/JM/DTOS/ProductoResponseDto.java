package com.repuestos.JM.DTOS;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductoResponseDto {
    private Integer idProducto;
    private String codigo;
    private String nombre;
    private String imagen;
    private String marcaVehiculo;
    private String nombre_categoria;
    private String nombre_proveedor;
    private BigDecimal precio;
    private Integer stock;
    private String descripcion;

    // Constructor requerido por JPQL
    public ProductoResponseDto(Integer idProducto, String codigo, String nombre, String imagen, 
                               String marcaVehiculo, String nombre_categoria, String nombre_proveedor,
                               BigDecimal precio, Integer stock, String descripcion) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.imagen = imagen;
        this.marcaVehiculo = marcaVehiculo;
        this.nombre_categoria = nombre_categoria;
        this.nombre_proveedor = nombre_proveedor;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
    }
}
