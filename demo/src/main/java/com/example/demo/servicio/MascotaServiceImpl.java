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
    public Mascota findById(int id) {
        return mascotasRepository.findById(id);
    }

    @Override
    public Collection<Mascota> findAll() {
        return mascotasRepository.findAll();
    }

    @Override
    public void deleteById(int id){
        repo.deleteById(id);
    }

    @Override
    public void update(Student student){
        repo.update(student);
    }

    @Override
    public void add(Student student){
        repo.add(student);
    }
}
