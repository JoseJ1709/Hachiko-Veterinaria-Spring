package com.example.demo.entidades;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tratamientos")
public class Tratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "veterinario_id")
    private Veterinario veterinario;

    @ManyToOne
    private Mascota mascota;

    @ManyToOne
    private Droga droga;

    private Date fecha;

    public Tratamiento(Date fecha){
        this.fecha = fecha;
    }


}
