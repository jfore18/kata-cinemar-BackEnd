package com.kata.cinemar.model.db.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "PELICULA")
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="ID_PELICULA")
    private Long id;

    @Column(name="TITULO", nullable = false, length = 255)
    private String titulo;

    @Column(name="DURACION", nullable = false)
    private Long duracion; // En minutos

    @Column(name="CLASIFICACION", length = 10)
    private String clasificacion;

    @Column(name="GENERO", length = 100)
    private String genero;
    
}

