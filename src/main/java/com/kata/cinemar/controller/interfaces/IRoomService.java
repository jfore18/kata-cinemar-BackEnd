package com.kata.cinemar.controller.interfaces;

import java.util.List;

import com.kata.cinemar.model.db.entities.Room;

public interface IRoomService {
	public List<Room>getAllRoom();
	public String addNewRoom(Room room);
}
