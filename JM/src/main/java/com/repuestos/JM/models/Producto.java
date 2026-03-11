package com.repuestos.JM.models;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(length = 50, unique = true)
    private String codigo;

    @Column(length = 150, nullable = false)
    private String nombre;

    @Column(length = 500)
    private String imagen;

    @Column(name = "marca_repuesto")
    private String marcaRepuesto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proveedor", nullable = false)
    private Proveedor proveedor;

    @Column(name = "codigo_oem")
    private String codigoOem;

    @Column(nullable = false)
    private BigDecimal precio;

    @Column(columnDefinition = "int default 0")
    private Integer stock;

    @Column(length = 300)
    private String descripcion;

    @Column(name = "es_universal")
    private Boolean esUniversal;

    // Relación ManyToMany con Vehiculo
    @ManyToMany
    @JoinTable(
        name = "ProductoVehiculo",
        joinColumns = @JoinColumn(name = "id_producto"),
        inverseJoinColumns = @JoinColumn(name = "id_vehiculo")
    )
    private Set<Vehiculo> vehiculos;
}