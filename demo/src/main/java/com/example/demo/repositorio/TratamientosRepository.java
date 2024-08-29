package com.example.demo.repositorio;

import com.example.demo.entidades.Tratamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamientosRepository extends JpaRepository<Tratamiento, Long> {
}
