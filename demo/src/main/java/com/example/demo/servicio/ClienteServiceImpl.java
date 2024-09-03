package com.example.demo.servicio;

import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Mascota;
import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.repositorio.MascotasRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public Cliente findById(Long id) {
        return clientesRepository.findById(id).get();
    }

    @Override
    public Collection<Cliente> findAll() {
        return clientesRepository.findAll();
    }
    @Autowired
    private MascotasRepository mascotasRepository;

    @Override
    @Transactional
    public void deleteById(Long id) {
        mascotasRepository.deleteByClienteId(id);
        clientesRepository.deleteById(id);
    }

    @Override
    public Cliente update(Cliente cliente) {
        Cliente existingCliente = clientesRepository.findById(cliente.getId())
                .orElseThrow(() -> new EntityNotFoundException("Cliente not found"));

        existingCliente.setNombre(cliente.getNombre());
        existingCliente.setCedula(cliente.getCedula());
        existingCliente.setCorreo(cliente.getCorreo());
        existingCliente.setCelular(cliente.getCelular());

        // Use helper methods to manage the collection
        existingCliente.getMascotasList().clear();
        for (Mascota mascota : cliente.getMascotasList()) {
            existingCliente.addMascota(mascota);
        }

        return clientesRepository.save(existingCliente);
    }

    @Override
    public void add(Cliente cliente) {
        clientesRepository.save(cliente);
    }
}
