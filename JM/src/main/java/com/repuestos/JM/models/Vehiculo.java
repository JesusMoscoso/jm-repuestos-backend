package com.repuestos.JM.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "vehiculos")
public class Vehiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private Integer idVehiculo;

    @Column(name = "marca", length = 100, nullable = false)
    private String marca;

    @Column(name = "modelo", length = 100, nullable = false)
    private String modelo;

    @Column(name = "anio")
    private Integer anio;

    @Column(name = "motor", length = 100)
    private String motor;

    @Column(name = "combustible", length = 50)
    private String combustible;

    @Column(name = "transmision", length = 50)
    private String transmision;

    @Column(name = "traccion", length = 50)
    private String traccion;

    @ManyToMany(mappedBy = "vehiculos")
    private Set<Producto> productos;
}
