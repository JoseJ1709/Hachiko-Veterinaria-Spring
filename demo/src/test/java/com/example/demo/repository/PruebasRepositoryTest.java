package com.example.demo.repository;

import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Mascota;
import com.example.demo.entidades.Tratamiento;
import com.example.demo.entidades.Veterinario;
import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.repositorio.MascotasRepository;
import com.example.demo.repositorio.TratamientosRepository;
import com.example.demo.repositorio.VeterinariosRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
import org.assertj.core.api.Assertions;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class PruebasRepositoryTest {

  @Autowired
  private MascotasRepository mascotasRepository;

  @Autowired
  private ClientesRepository clientesRepository;

  @Autowired
  private VeterinariosRepository veterinariosRepository;

  @Autowired
  private TratamientosRepository tratamientosRepository;

  @Test
  public void testFindByClienteId() {
    Cliente cliente = new Cliente();
    cliente.setCedula(12345);
    clientesRepository.save(cliente);

    Mascota mascota = new Mascota();
    mascota.setCliente(cliente);
    mascotasRepository.save(mascota);

    List<Mascota> mascotas = mascotasRepository.findByCliente_Id(cliente.getId());
    Assertions.assertThat(mascotas).isNotEmpty();
  }

  @Test
  @Transactional
  public void testDeleteByClienteId() {
    Cliente cliente = new Cliente();
    cliente.setCedula(12345);
    clientesRepository.save(cliente);

    Mascota mascota = new Mascota();
    mascota.setCliente(cliente);
    mascotasRepository.save(mascota);

    mascotasRepository.deleteByClienteId(cliente.getId());
    List<Mascota> mascotas = mascotasRepository.findByCliente_Id(cliente.getId());
    Assertions.assertThat(mascotas).isEmpty();
  }

  @Test
  public void testFindVeterinarioByCedula() {
    Veterinario veterinario = new Veterinario();
    veterinario.setCedula("VET123");
    veterinariosRepository.save(veterinario);

    Veterinario foundVeterinario = veterinariosRepository.findByCedula("VET123");
    Assertions.assertThat(foundVeterinario).isNotNull();
  }

  @Test
  public void testFindClienteByCedula() {
    Cliente cliente = new Cliente();
    cliente.setCedula(12345);
    clientesRepository.save(cliente);

    Cliente foundCliente = clientesRepository.findByCedula(12345);
    Assertions.assertThat(foundCliente).isNotNull();
  }

  @Test
  public void testFindTratamientoByVeterinarioId() {
    Veterinario veterinario = new Veterinario();
    veterinariosRepository.save(veterinario);

    Tratamiento tratamiento = new Tratamiento();
    tratamiento.setVeterinario(veterinario);
    tratamientosRepository.save(tratamiento);

    List<Tratamiento> tratamientos = tratamientosRepository.findByVeterinarioId(veterinario.getId());
    Assertions.assertThat(tratamientos).isNotEmpty();
  }

  @Test
  public void testFindTratamientoByMascotaId() {
    Mascota mascota = new Mascota();
    mascotasRepository.save(mascota);

    Tratamiento tratamiento = new Tratamiento();
    tratamiento.setMascota(mascota);
    tratamientosRepository.save(tratamiento);

    List<Tratamiento> tratamientos = tratamientosRepository.findByMascotaId(mascota.getId());
    Assertions.assertThat(tratamientos).isNotEmpty();
  }
}
