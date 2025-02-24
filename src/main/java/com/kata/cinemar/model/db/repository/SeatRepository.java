package com.kata.cinemar.model.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kata.cinemar.model.db.entities.Seat;

@Repository
public interface SeatRepository extends JpaRepository <Seat, Long> {

}
