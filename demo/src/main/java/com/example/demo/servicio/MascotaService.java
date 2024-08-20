package com.example.demo.servicio;
import com.example.demo.entidades.Mascota;

import java.util.Collection;

public interface MascotaService {
    public Mascota findById(int id);
    public Collection<Mascota> findAll(); id

    public void deleteById(int id);
    

    public void update(Student student);

    public void add (Student student);
    
}
