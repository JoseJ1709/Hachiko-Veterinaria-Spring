package com.example.demo.repositorio;

import com.example.demo.entidades.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinariosRepository extends JpaRepository<Veterinario, Long> {
    // select * from veterinarios where cedula = cedula
}
