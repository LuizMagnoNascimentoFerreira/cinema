package org.example.repository;

import org.example.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    @Modifying
    @Query("UPDATE Movie m SET m.title = ?1, m.releaseDate = ?2, m.genre = ?3,m.ageConstraint = ?4 WHERE m.id = ?5")
    void update(String title, LocalDate releaseDate, String genre, int ageConstraint, int id);
}
