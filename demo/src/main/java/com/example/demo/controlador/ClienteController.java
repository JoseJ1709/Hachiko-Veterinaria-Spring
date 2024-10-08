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

import java.util.List;

@RequestMapping("/cliente")
/*
  * @Controller
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {
  @Autowired
  ClienteService clienteService;
  @Autowired
  private MascotasRepository mascotasRepository;
  @Autowired
  private ClientesRepository clientesRepository;

  @GetMapping("/all")
  public List<Cliente> allClientes() {
    return clienteService.findAll();
  }
  @GetMapping("/find/{id}")
  public Cliente findCliente(@PathVariable("id") Long identificacion){
    return clienteService.findById(identificacion);
  }
  @GetMapping("/mascotas/{id}")
  public List<Mascota> mascotasCliente(@PathVariable("id") Long id, Model model){
    List<Mascota> mascotas = mascotasRepository.findByCliente_Id(id);
    return mascotas;
  }
  @PostMapping("/agregar")
  public void  agregarCliente(@RequestBody Cliente cliente){
    clienteService.add(cliente);
  }
  @DeleteMapping("/eliminar/{id}")
  public void eliminarCliente(@PathVariable("id") Long identificacion){
    clienteService.deleteById(identificacion);
  }
  @PutMapping("/editar/{id}")
  public void editarCliente(@RequestBody Cliente cliente
  ){
    clienteService.update(cliente);
  }
  @GetMapping("/login/{cedula}")
  public Cliente login(@PathVariable("cedula") Integer cedula){
    Cliente cliente = clientesRepository.findByCedula(cedula);

    return cliente;
  }

  @GetMapping("/registrar")
  public String registrarCliente (Model model){
      Cliente cliente = new Cliente(0,"","",0);
      model.addAttribute("cliente", cliente);

      return "crear_cliente";
  }
  @GetMapping("/editar/{id}")
  public String editarCliente(Model model,@PathVariable("id") Long identificacion){
      model.addAttribute("cliente", clienteService.findById(identificacion));
      return "editar_cliente";
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

}
