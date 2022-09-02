package org.example.service;

import org.example.model.entity.Movie;
import org.example.model.entity.Room;
import org.example.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    public Room save(Room room){
        return roomRepository.save(room);
    }
    public void delete(Room room){
        roomRepository.delete(room);
    }
    public List<Room> findAll(){
        return roomRepository.findAll();
    }
}
