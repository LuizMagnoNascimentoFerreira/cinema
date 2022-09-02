package org.example.controller;

import org.example.model.entity.Movie;
import org.example.model.entity.Room;
import org.example.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @PostMapping
    public ResponseEntity addRoom(@RequestBody Room room){
        roomService.save(room);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Room>> listRooms(){
        return new ResponseEntity<List<Room>>(roomService.findAll(),HttpStatus.OK);
    }

}
