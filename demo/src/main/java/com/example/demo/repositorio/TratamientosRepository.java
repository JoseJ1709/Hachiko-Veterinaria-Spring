package com.example.demo.repositorio;

import com.example.demo.entidades.Tratamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamientosRepository extends JpaRepository<Tratamiento, Long> {


    @Modifying
    @Query("DELETE FROM Tratamiento t WHERE t.mascota.id = :mascotaId")
    void deleteByMascotaId(Long mascotaId);

    @Modifying
    @Query("DELETE FROM Mascota m WHERE m.cliente.id = :clienteId")
    void deleteByClienteId(Long clienteId);
}
