package com.example.demo.servicio;

import com.example.demo.entidades.Veterinario;
import com.example.demo.repositorio.MascotasRepository;
import com.example.demo.repositorio.VeterinariosRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioServiceImpl implements VeterinarioService {

  @Autowired
  private VeterinariosRepository veterinariosRepository;
  @Autowired
  private MascotasRepository mascotasRepository;


  @Override
  public Veterinario findById(Long id) {
    return veterinariosRepository.findById(id).get();
  }

  @Override
  public List<Veterinario> findAll() {
    return veterinariosRepository.findAll();
  }

  @Override
  @Transactional
  public void deleteById(Long id) {
    veterinariosRepository.deleteById(id);
  }

  @Override
  public Veterinario update(Veterinario veterinario) {
    Veterinario existingVeterinario = veterinariosRepository.findById(veterinario.getId())
            .orElseThrow(() -> new EntityNotFoundException("Veterinario not found"));

    existingVeterinario.setNombre(veterinario.getNombre());
    existingVeterinario.setCedula(veterinario.getCedula());
    existingVeterinario.setContraseña(veterinario.getContraseña());
    existingVeterinario.setEspecialidad(veterinario.getEspecialidad());
    existingVeterinario.setFoto(veterinario.getFoto());
    existingVeterinario.setNum_atenciones(veterinario.getNum_atenciones());

    return veterinariosRepository.save(existingVeterinario);
  }

  @Override
  public void add(Veterinario veterinario) {
    veterinariosRepository.save(veterinario);
  }
}
