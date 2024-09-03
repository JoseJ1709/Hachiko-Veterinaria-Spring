package com.example.demo.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    private int cedula;
    private String nombre;
    private String correo;
    private int celular;

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mascota> mascotasList;

    public Cliente() {
        this.mascotasList = new ArrayList<>();
    }

    public Cliente(int cedula, String nombre, String correo, int celular) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }
    public Cliente(Long id, int cedula, String nombre, String correo, int celular) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public List<Mascota> getMascotasList() {
        return mascotasList;
    }

    public void setMascotasList(List<Mascota> mascotasList) {
        this.mascotasList = mascotasList;
    }

    public void addMascota(Mascota mascota) {
    }
    public void removeMascota(Mascota mascota) {
        mascotasList.remove(mascota);
        mascota.setCliente(null);
    }
}
