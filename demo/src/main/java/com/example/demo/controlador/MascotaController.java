package com.example.demo.controlador;

import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Mascota;
import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.servicio.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/mascota")
@RestController
@CrossOrigin(origins = "localhost:4200")
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    @Autowired
    ClientesRepository clientesRepository;

    @GetMapping("/all")
    public List<Mascota> allMascotas(Model model){
        return mascotaService.findAll();
    }
    @GetMapping("/find/{id}")
    public Mascota findMascota(Model model,@PathVariable("id") Long identificacion){
        Mascota mascota = mascotaService.findById(identificacion);
        return mascota;
    }
    @PostMapping("/agregar")
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
    @GetMapping("/registrar")
    public String registrarMascota(Model model){
        Mascota mascota = new Mascota("","",0,0,"",false,"");
        model.addAttribute("mascota", mascota);
        model.addAttribute("clientes", clientesRepository.findAll());

        return "crear_mascota";
    }

    @GetMapping("/editar/{id}")
    public String editarMascota(Model model,@PathVariable("id") Long identificacion){
        model.addAttribute("mascota",  mascotaService.findById(identificacion));
        model.addAttribute("clientes", clientesRepository.findAll());
        return "editar_mascota";
    }

}
