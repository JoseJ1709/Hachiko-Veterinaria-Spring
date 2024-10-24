package com.example.demo.service;

import com.example.demo.entidades.Droga;
import com.example.demo.entidades.Tratamiento;
import com.example.demo.repositorio.DrogasRepository;
import com.example.demo.servicio.TratamientoService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@ActiveProfiles("test")
public class TratamientosServiceTestNaive {

  @Autowired
  private TratamientoService tratamientoService;

  @Autowired
  private DrogasRepository drogasRepository;

  @Test
  public void testAdd() {
    Droga droga = new Droga();
    droga.setUni_disponibles(100);
    // Save the droga entity first
    drogasRepository.save(droga);

    Tratamiento tratamiento = new Tratamiento();
    tratamiento.setDroga(droga);
    tratamientoService.add(tratamiento);

    Tratamiento foundTratamiento = tratamientoService.findById(tratamiento.getId());
    Assertions.assertThat(foundTratamiento).isNotNull();
  }
  @Test
  public void testFindById() {
    Droga droga = new Droga();
    droga.setUni_disponibles(100);
    drogasRepository.save(droga);

    Tratamiento tratamiento = new Tratamiento();
    tratamiento.setDroga(droga);
    tratamientoService.add(tratamiento);

    Tratamiento foundTratamiento = tratamientoService.findById(tratamiento.getId());
    Assertions.assertThat(foundTratamiento).isNotNull();
  }

  @Test
  public void testFindAll() {
    Droga droga1 = new Droga();
    droga1.setUni_disponibles(100);
    drogasRepository.save(droga1);

    Droga droga2 = new Droga();
    droga2.setUni_disponibles(100);
    drogasRepository.save(droga2);

    Tratamiento tratamiento1 = new Tratamiento();
    tratamiento1.setDroga(droga1);
    tratamientoService.add(tratamiento1);

    Tratamiento tratamiento2 = new Tratamiento();
    tratamiento2.setDroga(droga2);
    tratamientoService.add(tratamiento2);

    List<Tratamiento> tratamientos = tratamientoService.findAll();
    Assertions.assertThat(tratamientos).isNotEmpty();
  }


  @Test
  public void testUpdate() {
    Droga droga = new Droga();
    droga.setUni_disponibles(100);
    drogasRepository.save(droga);

    Tratamiento tratamiento = new Tratamiento();
    tratamiento.setDroga(droga);
    tratamiento.setFecha(new Date(System.currentTimeMillis()));
    tratamientoService.add(tratamiento);

    Date newDate = new Date(System.currentTimeMillis() + 86400000);
    tratamiento.setFecha(newDate);
    Tratamiento updatedTratamiento = tratamientoService.update(tratamiento);

    Assertions.assertThat(updatedTratamiento.getFecha()).isEqualTo(newDate);
  }




}
