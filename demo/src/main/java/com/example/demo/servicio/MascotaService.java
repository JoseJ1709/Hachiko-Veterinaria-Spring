package com.example.demo.servicio;
import com.example.demo.entidades.Mascota;

import java.util.Collection;

public interface MascotaService {
<<<<<<< HEAD
    public Mascota findById(int id);
    public Collection<Mascota> findAll(); id

    public void deleteById(int id);
    

    public void update(Student student);

    public void add (Student student);
    
=======
    public Mascota findById(Long id);
    public Collection<Mascota> findAll();
    public void deleteById(Long id);
    public void update(Mascota mascota, Long idCliente);
    public void add(Mascota mascota, Long idCliente);
>>>>>>> fb36fbfb94ff087d679864ef87cc01c2fda56523
}
