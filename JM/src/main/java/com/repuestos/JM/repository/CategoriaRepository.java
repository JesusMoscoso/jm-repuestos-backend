package com.repuestos.JM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repuestos.JM.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
}
