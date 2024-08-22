package com.example.demo.servicio;

import java.util.Collection;

import com.example.demo.entidades.Cliente;
import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.repositorio.MascotasRepository;
import com.example.demo.entidades.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaServiceImpl implements MascotaService{
    @Autowired
    private MascotasRepository mascotasRepository;

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
<<<<<<< HEAD
    public void deleteById(int id){
        repo.deleteById(id);
    }

    @Override
    public void update(Student student){
        repo.update(student);
    }

    @Override
    public void add(Student student){
        repo.add(student);
    }
=======
    public void deleteById(Long id) {
        mascotasRepository.deleteById(id);
    }

    @Override
    public void update(Mascota mascota, Long idCliente) {
        Cliente cliente = clientesRepository.findById(idCliente).get();
        mascota.setCliente(cliente);
        String nomCliente = cliente.getNombre();
        mascota.setDueño(nomCliente);
        mascotasRepository.save(mascota);
    }

    @Override
    public void add(Mascota mascota, Long idCliente) {
        Cliente cliente = clientesRepository.findById(idCliente).get();
        mascota.setCliente(cliente);
        String nomCliente = cliente.getNombre();
        mascota.setDueño(nomCliente);
        mascotasRepository.save(mascota);
    }

>>>>>>> fb36fbfb94ff087d679864ef87cc01c2fda56523
}
