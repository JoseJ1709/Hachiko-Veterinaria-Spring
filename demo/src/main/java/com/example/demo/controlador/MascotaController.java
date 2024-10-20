package com.example.demo.controlador;

import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Mascota;
import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.servicio.MascotaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/mascota")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    @GetMapping("/all")
    public List<Mascota> allMascotas(Model model){
        return mascotaService.findAll();
    }
    @GetMapping("/find/{id}")
    public Mascota findMascota(Model model,@PathVariable("id") Long identificacion){
        Mascota mascota = mascotaService.findById(identificacion);
        return mascota;
    }
    @PostMapping("/agregar/{clienteId}")
    public void agregarMascota(@RequestBody Mascota mascota, @RequestParam("clienteId") Long clienteId){
      mascotaService.add(mascota, clienteId);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarMascota(@PathVariable("id") Long identificacion){
      mascotaService.deleteById(identificacion);
    }
    @PutMapping("/editar/{id}")
    public void  editarMascota(@RequestBody Mascota mascota, @RequestParam("clienteId") Long clienteId){
      mascotaService.update(mascota, clienteId);
    }


}
