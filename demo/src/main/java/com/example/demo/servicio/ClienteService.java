package com.example.demo.servicio;

import com.example.demo.entidades.Cliente;

import java.util.Collection;
import java.util.List;

public interface ClienteService {
    public Cliente findById(Long id);
    public List<Cliente> findAll();
    public void deleteById(Long id);
    public Cliente update(Cliente cliente);
    public void add(Cliente cliente);
    public Cliente findByCedula(int cedula);
}
