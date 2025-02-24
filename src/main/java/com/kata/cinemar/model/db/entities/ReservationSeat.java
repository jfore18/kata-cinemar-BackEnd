package com.kata.cinemar.model.db.entities;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "RESERVA_ASIENTO", uniqueConstraints = @UniqueConstraint(columnNames = {"movie", "room"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationSeat {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="ID_RESERVA_ASIENTO")
    private Long id;
	
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	   private List<Movie> movie;
	 
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	   private List<Room> room;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column (name="HORA_INICIO",nullable = false)
    private String horaInicio;

}
