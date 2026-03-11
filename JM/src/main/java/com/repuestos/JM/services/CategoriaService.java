package com.repuestos.JM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repuestos.JM.DTOS.CategoriaDto;
import com.repuestos.JM.interfaces.ICategoria;
import com.repuestos.JM.models.Categoria;
import com.repuestos.JM.repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoria {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //listar las categorias
    @Override
    public List<Categoria> obtenerCategorias() {
        return categoriaRepository.findAll();
    }

    //guardar la categoria
    @Override
    public Categoria guardarCategoria(CategoriaDto dto) {
        Categoria categoria = new Categoria();
        categoria.setNombre(dto.getNombre());
        categoria.setDescripcion(dto.getDescripcion());
        return categoriaRepository.save(categoria);
    }

  

}
