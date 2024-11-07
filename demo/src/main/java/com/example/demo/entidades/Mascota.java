package com.example.demo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.JoinTable;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.JoinColumn;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
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


    public Mascota(String nombre, String raza, int edad, int peso, String enfermedad, boolean estado, String imagen) {

        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.estado = estado;
        this.imagen = imagen;
    }


    public void setTratamientosList(List<Tratamiento> tratamientosList) {
        this.tratamientosList.clear();
        if (tratamientosList != null) {
            this.tratamientosList.addAll(tratamientosList);
        }
    }




    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
