package com.example.demo.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
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


    public Veterinario(String nombre, String cedula, String contraseña, String especialidad, String foto, int num_ateciones) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.especialidad = especialidad;
        this.foto = foto;
        this.num_atenciones = num_ateciones;
    }

}
