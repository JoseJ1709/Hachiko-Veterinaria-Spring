package com.example.demo.entidades;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "veterinarios")
public class Veterinario {
    private String nombre;
    private String cedula;
    private String contraseña;
    private String especialidad;
    private String foto;
    private int num_atenciones;

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }


    @OneToMany(mappedBy = "veterinario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tratamiento> tratamientosList;

    public Veterinario(Long id, String nombre, String cedula, String contraseña, String especialidad, String foto, int num_atenciones) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.especialidad = especialidad;
        this.foto = foto;
        this.num_atenciones = num_atenciones;
    }

    public Veterinario() {
    }

    public Veterinario(String nombre, String cedula, String contraseña, String especialidad, String foto, int num_ateciones) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.especialidad = especialidad;
        this.foto = foto;
        this.num_atenciones = num_ateciones;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getNum_atenciones() {
        return num_atenciones;
    }

    public void setNum_atenciones(int num_ateciones) {
        this.num_atenciones = num_ateciones;
    }
}
