package com.ap3dominator.bookMyShow.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class CinemaHall {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cinemaHallId;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false)
    private Integer totalSeats;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToMany(
            mappedBy = "cinemaHall",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference
    private Set<CinemaSeat> CinemaHallSeats;

    @OneToMany(
            mappedBy = "cinemaHall",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference(value="cinema_hall")
    private Set<Show> cinemaHallShows;


}
