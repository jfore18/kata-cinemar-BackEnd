package com.kata.cinemar.model.db.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "SALAS")
@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="ID_SALA")
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false)
    private int capacidad;
    
    @OneToMany(mappedBy = "sala", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Seat> asientos;

}
