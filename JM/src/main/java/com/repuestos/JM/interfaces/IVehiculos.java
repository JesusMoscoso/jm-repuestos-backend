package com.repuestos.JM.interfaces;

import java.util.List;

import com.repuestos.JM.DTOS.VehiculoDto;
import com.repuestos.JM.models.Vehiculo;

public interface IVehiculos {

    // CRUD BASICO DE VEHICULOS //

    //registro de vehiculo
    Vehiculo guardarVehiculo(VehiculoDto VehiculoDto);

    //listado de vehiculos
    List<Vehiculo> listarVehiculos();

    //eliminar un vehiculo por su id
    void eliminarVehiculo(Integer idVehiculo);

    //editar la informacion de un vehiculo


}
