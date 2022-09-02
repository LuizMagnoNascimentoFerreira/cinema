package org.example.controller;

import org.example.model.entity.Session;
import org.example.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {
    @Autowired
    SessionService sessionService;

    @PostMapping
    public ResponseEntity addSession(@RequestBody Session session){
        sessionService.save(session);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Session>> getSessions(){
        return new ResponseEntity<List<Session>>(sessionService.sessionJoin(),HttpStatus.OK);
    }

}
