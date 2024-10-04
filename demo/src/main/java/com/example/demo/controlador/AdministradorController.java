package com.example.demo.controlador;

import com.example.demo.servicio.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/administrador")
@RestController
@CrossOrigin(origins = "localhost:4200")
public class AdministradorController {
  @Autowired
  private AdministradorService administradorService;

  @GetMapping("/login")
  public boolean login(@RequestBody String usuario, @RequestBody String password) {
    return administradorService.login(usuario, password);
  }
}
