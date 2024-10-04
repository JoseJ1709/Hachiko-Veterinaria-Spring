package com.example.demo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;

import java.util.List;

@Entity
@Table(name = "mascotas")
public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private int peso;
    private String enfermedad;
    private boolean estado;

    @Column(length = 512)
    private String imagen;

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JsonIgnore
    private Cliente cliente;

    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Tratamiento> tratamientosList;

    public Mascota(Long id, String nombre, String raza, int edad, int peso, String enfermedad, boolean estado, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.estado = estado;
        this.imagen = imagen;
    }

    public Mascota() {
    }
    public Mascota(String nombre, String raza, int edad, int peso, String enfermedad, boolean estado, String imagen) {

        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.estado = estado;
        this.imagen = imagen;
    }

    public List<Tratamiento> getTratamientosList() {
        return tratamientosList;
    }

    public void setTratamientosList(List<Tratamiento> tratamientosList) {
        this.tratamientosList.clear();
        if (tratamientosList != null) {
            this.tratamientosList.addAll(tratamientosList);
        }
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {return raza;}
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
