package com.example.demo.controlador;

import com.example.demo.entidades.Droga;
import com.example.demo.servicio.DrogaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/droga")
@RestController
@CrossOrigin(origins = "localhost:4200")
public class DrograController {

    @Autowired
    DrogaService drogaService;

    @GetMapping("/all")
    public List<Droga> allDrogas() {
        return drogaService.findAll();
    }

    @GetMapping("/find/{id}")
    public Droga findDroga(@PathVariable("id") Long id) {
        return drogaService.findById(id);
    }

    @PostMapping("/add")
    public void addDroga(@RequestBody Droga droga) {
        drogaService.add(droga);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDroga(@PathVariable("id") Long id) {
        drogaService.deleteById(id);
    }

    @PutMapping("/update")
    public void updateDroga(@RequestBody Droga droga) {
        drogaService.update(droga);
    }
}
