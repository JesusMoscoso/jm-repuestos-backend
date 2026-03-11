package com.repuestos.JM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.repuestos.JM.models.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo,Integer> {
    
}
