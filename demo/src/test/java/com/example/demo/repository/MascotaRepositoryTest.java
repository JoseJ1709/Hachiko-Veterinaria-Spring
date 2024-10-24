package com.example.demo.repository;

import com.example.demo.entidades.Mascota;
import com.example.demo.repositorio.MascotasRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@RunWith(SpringRunner.class)
public class MascotaRepositoryTest {

  @Autowired
  private MascotasRepository mascotasRepository;

  @Test
  public void testSaveMascota() {
    Mascota mascota = new Mascota();
    mascota.setNombre("Fido");
    mascota.setRaza("Golden Retriever");
    mascota.setEdad(3);
    mascota.setPeso(30);
    mascota.setEnfermedad("Ninguna");
    mascota.setEstado(true);

    Mascota savedMascota = mascotasRepository.save(mascota);
    Assertions.assertThat(savedMascota).isNotNull();
  }

  @Test
  public void testFindMascotaById() {
    Mascota mascota = new Mascota();
    mascota.setNombre("Fido");
    mascota.setRaza("Golden Retriever");
    mascota.setEdad(3);
    mascota.setPeso(30);
    mascota.setEnfermedad("Ninguna");
    mascota.setEstado(true);

    Mascota savedMascota = mascotasRepository.save(mascota);
    Optional<Mascota> foundMascota = mascotasRepository.findById(savedMascota.getId());
    Assertions.assertThat(foundMascota).isPresent();
    Assertions.assertThat(foundMascota.get().getNombre()).isEqualTo("Fido");
  }

  @Test
  public void testUpdateMascota() {
    Mascota mascota = new Mascota();
    mascota.setNombre("Fido");
    mascota.setRaza("Golden Retriever");
    mascota.setEdad(3);
    mascota.setPeso(30);
    mascota.setEnfermedad("Ninguna");
    mascota.setEstado(true);

    Mascota savedMascota = mascotasRepository.save(mascota);
    savedMascota.setNombre("Firulais");
    Mascota updatedMascota = mascotasRepository.save(savedMascota);

    Assertions.assertThat(updatedMascota.getNombre()).isEqualTo("Firulais");
  }

  @Test
  public void testDeleteMascota() {
    Mascota mascota = new Mascota();
    mascota.setNombre("Fido");
    mascota.setRaza("Golden Retriever");
    mascota.setEdad(3);
    mascota.setPeso(30);
    mascota.setEnfermedad("Ninguna");
    mascota.setEstado(true);

    Mascota savedMascota = mascotasRepository.save(mascota);
    mascotasRepository.deleteById(savedMascota.getId());

    Optional<Mascota> deletedMascota = mascotasRepository.findById(savedMascota.getId());
    Assertions.assertThat(deletedMascota).isNotPresent();
  }
}
