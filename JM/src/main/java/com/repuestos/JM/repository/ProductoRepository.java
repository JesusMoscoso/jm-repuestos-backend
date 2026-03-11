package com.repuestos.JM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.repuestos.JM.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {



}