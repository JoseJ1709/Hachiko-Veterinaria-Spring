package com.example.demo.repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entidades.Mascota;

@Repository
public interface MascotasRepository extends JpaRepository<Mascota, Long> {
    // select * from mascotas where id_cliente = idCliente
    public Collection<Mascota> findByCliente_Id(Long idCliente);
}
