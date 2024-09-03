package com.example.demo.servicio;

import com.example.demo.entidades.Cliente;

import java.util.Collection;

public interface ClienteService {
    public Cliente findById(Long id);
    public Collection<Cliente> findAll();
    public void deleteById(Long id);
    public Cliente update(Cliente cliente);
    public void add(Cliente cliente);
}
