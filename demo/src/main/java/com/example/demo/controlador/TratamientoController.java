package com.example.demo.controlador;

import com.example.demo.entidades.Tratamiento;
import com.example.demo.servicio.TratamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tratamiento")
@RestController
@CrossOrigin(origins = "localhost:4200")
public class TratamientoController {
  @Autowired
  private TratamientoService tratamientoService;

  @GetMapping("/all")
  public List<Tratamiento> allTratamientos() {
    return tratamientoService.findAll();
  }

  @GetMapping("/veterinario/{id}")
  public List<Tratamiento> tratamientosCliente(@PathVariable("id") Long id){
    List<Tratamiento> tratamientos = tratamientoService.findByVeterinarioId(id);
    return tratamientos;
  }

  @GetMapping("/mascota/{id}")
  public List<Tratamiento> tratamientosMascota(@PathVariable("id") Long id){
    List<Tratamiento> tratamientos = tratamientoService.findByMascotaId(id);
    return tratamientos;
  }
}
