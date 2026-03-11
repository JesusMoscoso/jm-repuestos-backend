package com.repuestos.JM.interfaces;

import java.util.List;

import com.repuestos.JM.DTOS.CategoriaDto;
import com.repuestos.JM.models.Categoria;

public interface ICategoria {

    //listar lascategorias
    List<Categoria>obtenerCategorias();

    //registrar una categoria
    Categoria guardarCategoria(CategoriaDto dto);

    
}
