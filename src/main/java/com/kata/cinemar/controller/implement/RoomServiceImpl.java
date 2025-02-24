package com.kata.cinemar.controller.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kata.cinemar.controller.interfaces.IRoomService;
import com.kata.cinemar.model.db.entities.Room;
import com.kata.cinemar.model.db.repository.RoomRepository;

@Service

public class RoomServiceImpl implements IRoomService{

	@Autowired
	private RoomRepository roomRepository;
	@Override
	public List<Room> getAllRoom() {
		
		return roomRepository.findAll();
	}

	@Override
	public String addNewRoom(Room room) {
		roomRepository.save(room);
		return "Room added!";
	}
	
	

}
