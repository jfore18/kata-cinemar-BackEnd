package com.kata.cinemar.model.db.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ASIENTO_OLD", uniqueConstraints = @UniqueConstraint(columnNames = {"id_sala", "fila", "columna"}))
@Getter 
@Setter
@NoArgsConstructor 
@AllArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="ID_ASIENTO")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_sala", nullable = false)
    private Room sala;

    @Column(nullable = false, length = 5)
    private String fila;

    @Column(nullable = false)
    private int columna;

}
