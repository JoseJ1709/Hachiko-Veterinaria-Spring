package com.example.demo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
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
    @JsonIgnore
    private List<Mascota> mascotasList;


    public Cliente(int cedula, String nombre, String correo, int celular) {
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




    public void addMascota(Mascota mascota) {
    }
    public void removeMascota(Mascota mascota) {
        mascotasList.remove(mascota);
        mascota.setCliente(null);
    }
}
