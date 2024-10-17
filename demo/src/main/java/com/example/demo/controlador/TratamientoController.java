package com.example.demo.controlador;

import com.example.demo.entidades.Droga;
import com.example.demo.entidades.Mascota;
import com.example.demo.entidades.Tratamiento;
import com.example.demo.entidades.Veterinario;
import com.example.demo.servicio.DrogaService;
import com.example.demo.servicio.MascotaService;
import com.example.demo.servicio.TratamientoService;
import com.example.demo.servicio.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RequestMapping("/tratamiento")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TratamientoController {
  @Autowired
  private TratamientoService tratamientoService;

  @Autowired
  private VeterinarioService veterinarioService;

  @Autowired
  private MascotaService mascotaService;

  @Autowired
  private DrogaService drogaService;

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

  @PostMapping("/agregar/{mascotaId}/{veterinarioId}/{drogaId}/{fecha}")
  public void addTratamiento(
    @PathVariable("mascotaId") Long mascotaId,
    @PathVariable("veterinarioId") Long veterinarioId,
    @PathVariable("drogaId") Long drogaId,
    @PathVariable("fecha") String fecha){

    Tratamiento tratamiento = new Tratamiento();
    Mascota mascota = mascotaService.findById(mascotaId);
    Veterinario veterinario = veterinarioService.findById(veterinarioId);
    Droga droga = drogaService.findById(drogaId);

    Date fechat = Date.valueOf(fecha);
    tratamiento.setMascota(mascota);
    tratamiento.setVeterinario(veterinario);
    tratamiento.setDroga(droga);
    tratamiento.setFecha(fechat);

    tratamientoService.add(tratamiento);
  }
}
