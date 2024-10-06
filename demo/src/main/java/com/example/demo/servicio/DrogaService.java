package com.example.demo.servicio;

import com.example.demo.entidades.Droga;
import com.example.demo.repositorio.DrogasRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

public interface DrogaService {
    public void cargarDrogras() throws IOException;
    public Droga findById(Long id);
    public List<Droga> findAll();
    public void deleteById(Long id);
    public Droga update(Droga droga);
    public void add(Droga droga);


}
