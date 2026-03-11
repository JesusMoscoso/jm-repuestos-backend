package com.repuestos.JM.exceptions;

public class VehiculoNotFoundException extends RuntimeException {

    public VehiculoNotFoundException(Integer idVehiculo) {
        super("Vehículo con ID " + idVehiculo + " no encontrado");
    }

    public VehiculoNotFoundException(String mensaje) {
        super(mensaje);
    }
}