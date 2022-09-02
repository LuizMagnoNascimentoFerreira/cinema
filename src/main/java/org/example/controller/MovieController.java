package org.example.controller;

import org.example.model.entity.Movie;
import org.example.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;
    @PostMapping
    public ResponseEntity addMovie(@RequestBody Movie movie){
        movieService.save(movie);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Movie>> listMovies(){
        return new ResponseEntity<List<Movie>>(movieService.findAll(),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity updateMovie(@RequestBody Movie movie) {
        movieService.update(movie);
        System.out.println(movie);
        return new ResponseEntity(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteMovie(@PathVariable("id") int id){
        movieService.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}
