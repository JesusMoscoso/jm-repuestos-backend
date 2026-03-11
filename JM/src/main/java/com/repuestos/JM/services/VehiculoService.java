package com.repuestos.JM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repuestos.JM.DTOS.VehiculoDto;
import com.repuestos.JM.exceptions.VehiculoNotFoundException;
import com.repuestos.JM.interfaces.IVehiculos;
import com.repuestos.JM.models.Vehiculo;
import com.repuestos.JM.repository.VehiculoRepository;

@Service
public class VehiculoService implements IVehiculos{

    @Autowired
    private VehiculoRepository vehiculoRepository;

    //guardar vehiculo
    @Override
    public Vehiculo guardarVehiculo(VehiculoDto dto) {
        //nueva instancias de vehiculo
        Vehiculo vehiculo = new Vehiculo();
        //setiamos los valores
        vehiculo.setMarca(dto.getMarca());
        vehiculo.setModelo(dto.getModelo());
        vehiculo.setAnio(dto.getAnio());
        vehiculo.setMotor(dto.getMotor());
        vehiculo.setCombustible(dto.getCombustible());
        vehiculo.setTransmision(dto.getTransmision());
        vehiculo.setTraccion(dto.getTraccion());
        //guardar
        return vehiculoRepository.save(vehiculo);
    }

    //listar vehiculos
    @Override
    public List<Vehiculo> listarVehiculos() {
        return vehiculoRepository.findAll();
    }

    //eliminar vehiculo
    @Override
    public void eliminarVehiculo(Integer idVehiculo) {
        Vehiculo vehiculo = vehiculoRepository.findById(idVehiculo)
            .orElseThrow(() -> new VehiculoNotFoundException(idVehiculo));
    vehiculoRepository.delete(vehiculo);
    }

    //actualizar vehiculo
    @Override
    public Vehiculo actualizarVehiculo(Integer idVehiculo, VehiculoDto dto) {
        //buscamos el vehiculo con el id
        Vehiculo vehiculo = vehiculoRepository.findById(idVehiculo)
                .orElseThrow(() -> new VehiculoNotFoundException(idVehiculo));

        // actualizamos los datos
        vehiculo.setMarca(dto.getMarca());
        vehiculo.setModelo(dto.getModelo());
        vehiculo.setAnio(dto.getAnio());
        vehiculo.setMotor(dto.getMotor());
        vehiculo.setCombustible(dto.getCombustible());
        vehiculo.setTransmision(dto.getTransmision());
        vehiculo.setTraccion(dto.getTraccion());

        // guardamos los cambios
        return vehiculoRepository.save(vehiculo);
    }


}
