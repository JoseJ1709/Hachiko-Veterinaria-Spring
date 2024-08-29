package com.example.demo.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
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

    public Droga() {
    }

    public Droga(String nombre, int precio_compra, int precio_venta, int uni_disponibles, int uni_vendidas) {
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.uni_disponibles = uni_disponibles;
        this.uni_vendidas = uni_vendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(int precio_compra) {
        this.precio_compra = precio_compra;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getUni_disponibles() {
        return uni_disponibles;
    }

    public void setUni_disponibles(int uni_disponibles) {
        this.uni_disponibles = uni_disponibles;
    }

    public int getUni_vendidas() {
        return uni_vendidas;
    }

    public void setUni_vendidas(int uni_vendidas) {
        this.uni_vendidas = uni_vendidas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
