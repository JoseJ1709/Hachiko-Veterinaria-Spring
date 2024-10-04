package com.example.demo.servicio;

import com.example.demo.entidades.Tratamiento;
import com.example.demo.repositorio.TratamientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TratamientoServiceImpl implements TratamientoService{
  @Autowired
  private TratamientosRepository tratamientosRepository;

  @Override
  public Tratamiento findById(Long id) {
    return tratamientosRepository.findById(id).get();
  }

  @Override
  public List<Tratamiento> findAll() {
    return tratamientosRepository.findAll();
  }

  @Override
  public void deleteById(Long id) {
    tratamientosRepository.deleteById(id);
  }

  @Override
  public Tratamiento update(Tratamiento tratamiento) {
    return tratamientosRepository.save(tratamiento);
  }

  @Override
  public void add(Tratamiento tratamiento) {
    tratamientosRepository.save(tratamiento);
  }

  @Override
  public List<Tratamiento> findByVeterinarioId(Long id) {
    return tratamientosRepository.findByVeterinarioId(id);
  }

  @Override
  public List<Tratamiento> findByMascotaId(Long id) {
    return tratamientosRepository.findByMascotaId(id);
  }
}
