package com.example.demo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "drogas")
public class Droga {
    private String nombre;
    private int precio_compra;
    private int precio_venta;
    private int uni_disponibles;
    private int uni_vendidas;

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "droga")
    private List<Tratamiento> tratamientosList;
    public Droga(Long id, String nombre, int precio_compra, int precio_venta, int uni_disponibles, int uni_vendidas) {
        this.id = id;
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.uni_disponibles = uni_disponibles;
        this.uni_vendidas = uni_vendidas;
    }



    public Droga(String nombre, int precio_compra, int precio_venta, int uni_disponibles, int uni_vendidas) {
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.uni_disponibles = uni_disponibles;
        this.uni_vendidas = uni_vendidas;
    }


  public void venderUnidades(int cantidad) {
    if (cantidad <= uni_disponibles) {
      this.uni_disponibles -= cantidad;
      this.uni_vendidas += cantidad;
    } else {
      throw new IllegalArgumentException("No hay suficientes unidades disponibles");
    }
  }
}
