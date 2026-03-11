package com.repuestos.JM.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.repuestos.JM.DTOS.VehiculoDto;
import com.repuestos.JM.models.Vehiculo;
import com.repuestos.JM.services.VehiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vehiculos") 
@CrossOrigin(origins = "http://localhost:4200")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @PostMapping("/guardar")
    public ResponseEntity<Vehiculo> guardarVehiculo(@RequestBody VehiculoDto dto) {
        Vehiculo vehiculoGuardado = vehiculoService.guardarVehiculo(dto);
        return ResponseEntity.ok(vehiculoGuardado);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Vehiculo>> listarVehiculos() {
        List<Vehiculo> vehiculos = vehiculoService.listarVehiculos();
        return ResponseEntity.ok(vehiculos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarVehiculo(@PathVariable Integer id) {
        vehiculoService.eliminarVehiculo(id);
        return ResponseEntity.ok("Vehículo eliminado correctamente");
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> actualizarVehiculo(@PathVariable Integer id, 
                                                    @RequestBody VehiculoDto dto) {
        vehiculoService.actualizarVehiculo(id, dto);
        return ResponseEntity.ok("Vehículo actualizado correctamente");
    }


    


}
