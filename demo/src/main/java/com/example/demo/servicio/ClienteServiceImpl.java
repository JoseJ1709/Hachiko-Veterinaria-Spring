package com.example.demo.servicio;

import com.example.demo.entidades.Cliente;
import com.example.demo.repositorio.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public void deleteById(Long id) {
        clientesRepository.deleteById(id);
    }

    @Override
    public void update(Cliente cliente) {
        clientesRepository.save(cliente);
    }

    @Override
    public void add(Cliente cliente) {
        clientesRepository.save(cliente);
    }
}
