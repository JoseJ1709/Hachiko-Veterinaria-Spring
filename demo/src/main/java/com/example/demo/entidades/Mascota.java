package com.example.demo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "mascotas")
public class Mascota {
    private String dueño;
    private String nombre;
    private String raza;
    private int edad;
    private int peso;
    private String enfermedad;
    private boolean estado;
    private int tratamientos;
    private String imagen;

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Cliente cliente;

    public Mascota(Long id,String dueño, String nombre, String raza, int edad, int peso, String enfermedad, boolean estado, int tratamientos, String imagen) {
        this.id = id;
        this.dueño = dueño;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.estado = estado;
        this.tratamientos = tratamientos;
        this.imagen = imagen;
    }

    public Mascota() {
    }
    public Mascota(String dueño, String nombre, String raza, int edad, int peso, String enfermedad, boolean estado, int tratamientos, String imagen) {

        this.dueño = dueño;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.estado = estado;
        this.tratamientos = tratamientos;
        this.imagen = imagen;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
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

    public int getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(int tratamientos) {
        this.tratamientos = tratamientos;
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
