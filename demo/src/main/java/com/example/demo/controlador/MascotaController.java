package com.example.demo.controlador;

import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Mascota;
import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.servicio.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mascota")
@Controller
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    @Autowired
    ClientesRepository clientesRepository;

    @GetMapping("/all")
    public String allMascotas(Model model){
        model.addAttribute("mascotas", mascotaService.findAll());
        return "mascotas";
    }
    @GetMapping("/find/{id}")
    public String findMascota(Model model,@PathVariable("id") Long identificacion){
        model.addAttribute("mascota", mascotaService.findById(identificacion));
        return "mascota";
    }
    @GetMapping("/registrar")
    public String registrarMascota(Model model){
        Mascota mascota = new Mascota("","",0,0,"",false,"");
        model.addAttribute("mascota", mascota);
        model.addAttribute("clientes", clientesRepository.findAll());

        return "crear_mascota";
    }
    @PostMapping("/agregar")
    public String agregarMascota(@ModelAttribute("mascota") Mascota mascota, @RequestParam("clienteId") Long clienteId) {
        mascotaService.add(mascota, clienteId);
        return "redirect:/mascota/all";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarMascota(@PathVariable("id") Long identificacion){
        mascotaService.deleteById(identificacion);
        return "redirect:/mascota/all";
    }
    @GetMapping("/editar/{id}")
    public String editarMascota(Model model,@PathVariable("id") Long identificacion){
        model.addAttribute("mascota",  mascotaService.findById(identificacion));
        model.addAttribute("clientes", clientesRepository.findAll());
        return "editar_mascota";
    }
    @PostMapping("/editar/{id}")
    public String editarMascota(@PathVariable("id") int identificacion, @ModelAttribute("mascota") Mascota mascota, @RequestParam("clienteId") Long clienteId) {
        mascotaService.update(mascota, clienteId);
        return "redirect:/mascota/all";
    }
}