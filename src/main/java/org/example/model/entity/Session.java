package org.example.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "date_time")
    private LocalDateTime dateTime;
    @Column (name = "dubbed_or_subtitled")
    private String dubbedOrSubtitled; //Dublado ou legendado
    private String dimension; //3D ou 2D
    @JoinColumn(name = "movie_id")
    @ManyToOne
    private Movie movie;
    @JoinColumn(name = "room_id")
    @ManyToOne
    private Room room;
}
