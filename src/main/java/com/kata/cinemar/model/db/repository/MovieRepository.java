package com.kata.cinemar.model.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kata.cinemar.model.db.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
