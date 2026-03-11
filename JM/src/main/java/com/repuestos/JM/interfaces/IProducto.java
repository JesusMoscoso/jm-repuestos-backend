package com.repuestos.JM.interfaces;
import com.repuestos.JM.DTOS.ProductoDto;
import com.repuestos.JM.models.Producto;

public interface IProducto {
  
    //1-registro de un producto
    Producto guardarProducto(ProductoDto productoDto);

    
}
