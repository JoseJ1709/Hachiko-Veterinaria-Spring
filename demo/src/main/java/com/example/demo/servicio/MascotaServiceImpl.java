package com.example.demo.servicio;

import java.util.Collection;

import com.example.demo.repositorio.MascotasRepository;
import com.example.demo.entidades.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaServiceImpl implements MascotaService{
    @Autowired
    private MascotasRepository mascotasRepository;

    @Override
    public Mascota findById(Long id) {
        return mascotasRepository.findById(id).get();
    }

    @Override
    public Collection<Mascota> findAll() {
        return mascotasRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        mascotasRepository.deleteById(id);
    }

    @Override
    public void update(Mascota mascota) {
        mascotasRepository.save(mascota);
    }

    @Override
    public void add(Mascota mascota) {
        mascotasRepository.save(mascota);
    }

}
