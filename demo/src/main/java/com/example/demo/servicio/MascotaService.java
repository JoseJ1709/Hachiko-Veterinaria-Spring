package com.example.demo.servicio;
import com.example.demo.entidades.Mascota;

import java.util.Collection;

public interface MascotaService {

    public Mascota findById(Long id);
    public Collection<Mascota> findAll();
    public void deleteById(Long id);
    public void update(Mascota mascota, Long idCliente);
    public void add(Mascota mascota, Long idCliente);
}
