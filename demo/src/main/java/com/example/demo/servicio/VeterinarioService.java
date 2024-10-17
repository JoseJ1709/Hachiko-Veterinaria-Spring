package com.example.demo.servicio;

import com.example.demo.entidades.Veterinario;

import java.util.List;

public interface VeterinarioService {
    public Veterinario findById(Long id);
    public List<Veterinario> findAll();
    public void deleteById(Long id);
    public Veterinario update(Veterinario veterinario);
    public void add(Veterinario veterinario);

}
