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
@Table(name = "`show`")
@Getter
@Setter
public class Show {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showId;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String startTime;

    @Column(nullable = false)
    private String endTime;

    @ManyToOne
    @JsonBackReference(value="movie")
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JsonBackReference(value="cinema_hall")
    @JoinColumn(name = "cinema_hall_id")
    private CinemaHall cinemaHall;


    @OneToMany(
            mappedBy = "show",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference(value="show")
    private Set<Booking> allBookings;

    @OneToMany(mappedBy = "show")
    private Set<ShowSeat> allShowSeats;



}
