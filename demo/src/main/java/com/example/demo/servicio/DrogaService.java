package com.example.demo.servicio;

import com.example.demo.entidades.Droga;

import java.util.List;

public interface DrogaService {
    public Droga findById(Long id);
    public List<Droga> findAll();
    public void deleteById(Long id);
    public Droga update(Droga droga);
    public void add(Droga droga);
}
