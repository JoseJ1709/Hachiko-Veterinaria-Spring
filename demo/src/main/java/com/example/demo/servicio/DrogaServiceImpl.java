package com.example.demo.servicio;

import com.example.demo.entidades.Droga;
import com.example.demo.repositorio.DrogasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrogaServiceImpl implements DrogaService {
    @Autowired
    private DrogasRepository drogaRepository;

    @Override
    public Droga findById(Long id) {
        return drogaRepository.findById(id).get();
    }

    @Override
    public List<Droga> findAll() {
        return drogaRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        drogaRepository.deleteById(id);
    }

    @Override
    public Droga update(Droga droga) {
        return drogaRepository.save(droga);
    }

    @Override
    public void add(Droga droga) {
        drogaRepository.save(droga);
    }
}
