package com.kata.cinemar.controller.implement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kata.cinemar.controller.interfaces.IReservationSeatService;
import com.kata.cinemar.model.db.entities.ReservationSeat;
import com.kata.cinemar.model.db.repository.ReservationSeatRepository;

@Service

public class ReservationSeatServiceImpl implements IReservationSeatService{

	@Autowired
	private ReservationSeatRepository reservationSeatRepository;
	@Override
	public List<ReservationSeat> getAllReservationSeat() {
		
		return reservationSeatRepository.findAll();
	}

	@Override
	public String addNewReservationSeat(ReservationSeat reservationSeat) {
		reservationSeatRepository.save(reservationSeat);
		return "Reservation Seat added!";
	}

}

