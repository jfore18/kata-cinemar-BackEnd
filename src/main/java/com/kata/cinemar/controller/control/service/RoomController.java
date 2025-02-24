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
import com.kata.cinemar.controller.interfaces.IRoomService;
import com.kata.cinemar.model.db.entities.Room;

@RestController
@RequestMapping("/api")

public class RoomController {

	
	@Autowired
	private IRoomService roomService;
	
	@PostMapping("/new-room")
	public ResponseEntity<String> addNewRoom (@RequestBody Room room){
		String result = roomService.addNewRoom(room);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	
	@GetMapping("/all-room")
	public ResponseEntity<List<Room>> getAllRoom(){
		List<Room> rooms = roomService.getAllRoom();
		return ResponseEntity.status(HttpStatus.OK).body(rooms);
	}
}
