package com.repuestos.JM.services;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repuestos.JM.DTOS.ProductoDto;
import com.repuestos.JM.interfaces.IProducto;
import com.repuestos.JM.models.Categoria;
import com.repuestos.JM.models.Producto;
import com.repuestos.JM.models.Proveedor;
import com.repuestos.JM.models.Vehiculo;
import com.repuestos.JM.repository.CategoriaRepository;
import com.repuestos.JM.repository.ProductoRepository;
import com.repuestos.JM.repository.ProveedorRepository;
import com.repuestos.JM.repository.VehiculoRepository;

@Service
public class ProductosService implements IProducto {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;


   

    @Override
    public Producto guardarProducto(ProductoDto productoDto) {

        // Creamos la entidad Producto
        Producto producto = new Producto();

        // Seteamos los valores básicos desde el DTO
        producto.setCodigo(productoDto.getCodigo());
        producto.setNombre(productoDto.getNombre());
        producto.setImagen(productoDto.getImagen());
        producto.setCodigoOem(productoDto.getCodigoOEM());
        producto.setPrecio(productoDto.getPrecio());
        producto.setStock(productoDto.getStock() != null ? productoDto.getStock() : 0);
        producto.setDescripcion(productoDto.getDescripcion());
        producto.setEsUniversal(productoDto.getEsUniversal() != null ? productoDto.getEsUniversal() : false);

        // Seteamos la categoría asociada
        Categoria categoria = categoriaRepository.findById(productoDto.getIdCategoria())
            .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
        producto.setCategoria(categoria);

        // Seteamos el proveedor asociado
        Proveedor proveedor = proveedorRepository.findById(productoDto.getIdProveedor())
            .orElseThrow(() -> new RuntimeException("Proveedor no encontrado"));
        producto.setProveedor(proveedor);

        // Si el DTO incluye vehículos, los asociamos
        if (productoDto.getIdsVehiculos() != null && !productoDto.getIdsVehiculos().isEmpty()) {

            Set<Vehiculo> vehiculos = new HashSet<>();

            for (Integer idVehiculo : productoDto.getIdsVehiculos()) {
                Vehiculo vehiculo = vehiculoRepository.findById(idVehiculo)
                        .orElseThrow(() -> new RuntimeException("Vehículo con id " + idVehiculo + " no encontrado"));
                vehiculos.add(vehiculo);
            }

            producto.setVehiculos(vehiculos);
        }
        // Guardamos el producto en la base de datos
        return productoRepository.save(producto);
    }
    
}
