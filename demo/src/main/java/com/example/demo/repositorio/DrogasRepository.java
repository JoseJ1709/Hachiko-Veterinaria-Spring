package com.example.demo.repositorio;

import com.example.demo.entidades.Droga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrogasRepository extends JpaRepository<Droga, Long> {

}
