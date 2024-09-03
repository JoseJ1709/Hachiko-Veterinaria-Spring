package com.example.demo.controlador;

import com.example.demo.ErrorHandling.NotFoundException;
import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Mascota;
import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.repositorio.MascotasRepository;
import com.example.demo.servicio.ClienteService;
import com.example.demo.servicio.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/cliente")
@Controller
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @Autowired
    private MascotasRepository mascotasRepository;
    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping("/all")
    public String allClientes(Model model){
        model.addAttribute("clientes", clienteService.findAll());
        return "clientes";
    }

    @GetMapping("/registrar")
    public String registrarCliente (Model model){
        Cliente cliente = new Cliente(0,"","",0);
        model.addAttribute("cliente", cliente);

        return "crear_cliente";
    }
    @PostMapping("/agregar")
    public String agregarClie0nte(@ModelAttribute("cliente") Cliente cliente){
        clienteService.add(cliente);
        return "redirect:/cliente/all";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable("id") Long identificacion){
        clienteService.deleteById(identificacion);
        return "redirect:/cliente/all";
    }
    @GetMapping("/editar/{id}")
    public String editarCliente(Model model,@PathVariable("id") Long identificacion){
        model.addAttribute("cliente", clienteService.findById(identificacion));
        return "editar_cliente";
    }
    @PostMapping("/editar/{id}")
    public String editarCliente(@PathVariable("id") Long identificacion, @ModelAttribute("cliente") Cliente cliente){
        clienteService.update(cliente);
        return "redirect:/cliente/all";
    }
    @GetMapping("/login")
    public String login(Model model){
        Cliente cliente = new Cliente(0,"","",0);
        model.addAttribute("cliente", cliente);
        return "login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("cliente") Cliente cliente, Model model){
        Cliente foundCliente = clientesRepository.findByCedula(cliente.getCedula());
        if (foundCliente == null) {
            throw new NotFoundException(cliente.getCedula());
        }
        Cliente cliente1 = clientesRepository.findByCedula(cliente.getCedula());
        if(cliente1.getCedula() == cliente.getCedula()){
            Long id = cliente1.getId();
            return "redirect:/cliente/mascotas/"+id;
        }
        return "redirect:/cliente/login";
    }
    @GetMapping("/mascotas/{id}")
    public String mascotasCliente(@PathVariable("id") Long id, Model model){
        Cliente cliente = clienteService.findById(id);
        model.addAttribute("mascotas", mascotasRepository.findByCliente_Id(id));
        model.addAttribute("cliente", cliente);
        return "mascotas_cliente";
    }
}