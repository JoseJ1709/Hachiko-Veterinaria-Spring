package com.example.demo.servicio;

import com.example.demo.entidades.Tratamiento;

import java.util.List;

public interface TratamientoService {
    public Tratamiento findById(Long id);
    public List<Tratamiento> findAll();
    public void deleteById(Long id);
    public Tratamiento update(Tratamiento tratamiento);
    public void add(Tratamiento tratamiento);
    public List<Tratamiento> findByVeterinarioId(Long id);
    public List<Tratamiento> findByMascotaId(Long id);
}
