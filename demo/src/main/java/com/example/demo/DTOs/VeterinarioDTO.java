package com.example.demo.DTOs;

import lombok.Data;

@Data
public class VeterinarioDTO {
    private String nombre;
    private String cedula;
    private String especialidad;
    private String foto;
    private int num_atenciones;
}
