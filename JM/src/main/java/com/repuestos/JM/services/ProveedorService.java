package com.repuestos.JM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repuestos.JM.interfaces.IProveedor;
import com.repuestos.JM.models.Proveedor;
import com.repuestos.JM.repository.ProveedorRepository;

@Service
public class ProveedorService implements IProveedor {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> listarProveedores() {
        return proveedorRepository.findAll();
    }
    
}
