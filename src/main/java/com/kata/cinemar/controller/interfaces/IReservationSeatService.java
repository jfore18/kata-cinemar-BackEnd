package com.kata.cinemar.controller.interfaces;

import java.util.List;

import com.kata.cinemar.model.db.entities.ReservationSeat;

public interface IReservationSeatService {
	public List<ReservationSeat>getAllReservationSeat();
	public String addNewReservationSeat(ReservationSeat reservationSeat);
}
