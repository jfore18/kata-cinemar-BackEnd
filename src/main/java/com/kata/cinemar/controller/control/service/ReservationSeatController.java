package com.kata.cinemar.controller.control.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kata.cinemar.controller.interfaces.IReservationSeatService;
import com.kata.cinemar.model.db.entities.ReservationSeat;

@RestController
@RequestMapping("/api")

public class ReservationSeatController {

	
	@Autowired
	private IReservationSeatService reservationSeatService;
	
	@PostMapping("/new-reservationseat")
	
	public ResponseEntity<String> addNewReservationSeat (@RequestBody ReservationSeat reservationSeat){
		String result = reservationSeatService.addNewReservationSeat(reservationSeat);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	
	@GetMapping("/all-reservationSeat")
	public ResponseEntity<List<ReservationSeat>> getAllReservationSeat(){
		List<ReservationSeat> reservationSeat = reservationSeatService.getAllReservationSeat();
		return ResponseEntity.status(HttpStatus.OK).body(reservationSeat);
	}
}