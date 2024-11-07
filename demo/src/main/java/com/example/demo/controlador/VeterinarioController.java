package com.example.demo.controlador;

import com.example.demo.DTOs.VeterinarioDTO;
import com.example.demo.DTOs.VeterinarioMapper;
import com.example.demo.entidades.Veterinario;
import com.example.demo.repositorio.VeterinariosRepository;
import com.example.demo.servicio.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
  public ResponseEntity<VeterinarioDTO> login(@PathVariable("cedula") String cedula, @PathVariable("contrasena") String contrasena) {
    Veterinario veterinario = veterinarioService.findByCedula(cedula);
    if (veterinario != null && veterinario.getContraseña().equals(contrasena)) {
        VeterinarioDTO veterinarioDTO = VeterinarioMapper.INSTANCE.convert(veterinario);
        return new ResponseEntity<>(veterinarioDTO, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}

  @PostMapping("/agregar")
  public ResponseEntity agregarVeterinario(@RequestBody Veterinario veterinario) {
    Veterinario newVeterinario = veterinarioService.add(veterinario);
    VeterinarioDTO veterinarioDTO = VeterinarioMapper.INSTANCE.convert(newVeterinario);

    if (newVeterinario == null) {
      return new ResponseEntity<String>("user Not found", HttpStatus.BAD_REQUEST);
      
    }

    return new ResponseEntity<VeterinarioDTO>(veterinarioDTO, HttpStatus.CREATED);
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
