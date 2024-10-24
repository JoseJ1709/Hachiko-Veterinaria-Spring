package com.example.demo.controlador;

import com.example.demo.entidades.Veterinario;
import com.example.demo.repositorio.VeterinariosRepository;
import com.example.demo.servicio.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/veterinario")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VeterinarioController {
  @Autowired
  VeterinarioService veterinarioService;

  @GetMapping("/all")
  public List<Veterinario> allVeterinarios() {
    return veterinarioService.findAll();
  }

  @GetMapping("/find/{id}")
  public Veterinario findVeterinario( @PathVariable("id") Long identificacion) {
    Veterinario veterinario = veterinarioService.findById(identificacion);
    return veterinario;
  }

  @GetMapping("/login/{cedula}/{contrasena}")
  public Veterinario login(@PathVariable("cedula") String cedula , @PathVariable("contrasena") String contrasena) {
    Veterinario veterinario = veterinarioService.findByCedula(cedula);
    if(veterinario.getContraseña().equals(contrasena)){
      return veterinario;
    }
    else {
      return null;
    }
  }

  @PostMapping("/agregar")
  public void agregarVeterinario(@RequestBody Veterinario veterinario) {
    veterinarioService.add(veterinario);
  }

  @DeleteMapping("/eliminar/{id}")
  public void eliminarVeterinario(@PathVariable("id") Long id) {
    veterinarioService.deleteById(id);
  }

  @PutMapping("/editar/{id}")
  public void editarVeterinario(@RequestBody Veterinario veterinario) {
    veterinarioService.update(veterinario);
  }

}
