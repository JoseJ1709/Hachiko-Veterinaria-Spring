package com.example.demo.controlador;

import com.example.demo.servicio.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mascota")
@Controller
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    @GetMapping("/all")
    public String allMascotas(Model model){
        model.addAttribute("mascotas", mascotaService.findAll());
        return "mascotas";
    }
    @GetMapping("/find/{id}")
    public String findMascota(Model model,@PathVariable("id") int identificacion){
        model.addAttribute("mascota", mascotaService.findById(identificacion));
        return "mascota";
    }
}