package com.example.demo.servicio;

import com.example.demo.entidades.Cliente;
import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.repositorio.MascotasRepository;
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
    public void update(Cliente cliente) {
        clientesRepository.save(cliente);
    }

    @Override
    public void add(Cliente cliente) {
        clientesRepository.save(cliente);
    }
}
