package com.example.demo.repositorio;

import com.example.demo.entidades.Administrador;
import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public interface AdministradoresRepository extends JpaRepository<Administrador, Long> {
    // select * from administradores where usuario = usuario and password = password
    Administrador findByUsuarioAndPassword(String usuario, String password);
}
