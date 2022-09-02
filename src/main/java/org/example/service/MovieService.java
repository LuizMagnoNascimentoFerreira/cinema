package org.example.service;

import org.example.model.entity.Movie;
import org.example.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }
    public void delete(Movie movie){
        movieRepository.delete(movie);
    }
    public Optional<Movie> findOne(Example<Movie> movieExample){
        return movieRepository.findOne(movieExample);
    }
    public List<Movie> findAll(){
        return movieRepository.findAll();
    }
    @Transactional
    public void deleteById(int id){
        movieRepository.deleteById(id);
    }
    @Transactional
    public void update(Movie movie){
        movieRepository.update(movie.getTitle(), movie.getReleaseDate(), movie.getGenre(),movie.getAgeConstraint(),movie.getId());
    }
}
