package com.example.demo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "administradores")
public class Administrador {

    private String usuario;
    private String password;

    @Id
    @GeneratedValue
    private Long id;

    public Administrador() {
    }

    public Administrador(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Administrador(Long id, String usuario, String password) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
