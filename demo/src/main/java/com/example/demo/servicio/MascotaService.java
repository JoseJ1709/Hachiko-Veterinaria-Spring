package com.example.demo.servicio;
import com.example.demo.entidades.Mascota;

import java.util.Collection;
import java.util.List;

public interface MascotaService {

    public Mascota findById(Long id);
    public List<Mascota> findAll();
    public void deleteById(Long id);
    public void update(Mascota mascota, Long idCliente);
    public void add(Mascota mascota, Long idCliente);
    public List<Mascota> findByCliente_Id(Long idCliente);
}
