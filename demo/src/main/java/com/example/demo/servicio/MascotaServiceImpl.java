package com.example.demo.servicio;

import java.util.Collection;

import com.example.demo.entidades.Cliente;
import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.repositorio.MascotasRepository;
import com.example.demo.entidades.Mascota;
import com.example.demo.repositorio.TratamientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MascotaServiceImpl implements MascotaService{
    @Autowired
    private MascotasRepository mascotasRepository;

    @Autowired
    private TratamientosRepository tratamientosRepository;

    @Override
    @Transactional
    public void deleteById(Long id) {
        tratamientosRepository.deleteByMascotaId(id);
        mascotasRepository.deleteById(id);
    }

    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public Mascota findById(Long id) {
        return mascotasRepository.findById(id).get();
    }

    @Override
    public Collection<Mascota> findAll() {
        return mascotasRepository.findAll();
    }



    @Override
    @Transactional
    public void update(Mascota mascota, Long idCliente) {
        Cliente cliente = clientesRepository.findById(idCliente).orElseThrow(() -> new RuntimeException("Cliente not found"));
        Mascota existingMascota = mascotasRepository.findById(mascota.getId()).orElseThrow(() -> new RuntimeException("Mascota not found"));

        // Actualizar todos los campos de la mascota existente
        existingMascota.setNombre(mascota.getNombre());
        existingMascota.setRaza(mascota.getRaza());
        existingMascota.setEdad(mascota.getEdad());
        existingMascota.setPeso(mascota.getPeso());
        existingMascota.setEnfermedad(mascota.getEnfermedad());
        existingMascota.setEstado(mascota.getEstado());
        existingMascota.setImagen(mascota.getImagen());
        existingMascota.setCliente(cliente);
        existingMascota.setTratamientosList(mascota.getTratamientosList());

        // Guardar la mascota actualizada
        mascotasRepository.save(existingMascota);
    }
    @Override
    public void add(Mascota mascota, Long idCliente) {
        Cliente cliente = clientesRepository.findById(idCliente).get();
        mascota.setCliente(cliente);
        mascotasRepository.save(mascota);
    }
}
