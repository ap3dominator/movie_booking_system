package com.ap3dominator.bookMyShow.domain;

import com.ap3dominator.bookMyShow.model.CinemaSeatType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class CinemaSeat {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cinemaSeatId;

    @Column(nullable = false)
    private Integer seatNumber;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CinemaSeatType type;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "cinema_hall_id")
    private CinemaHall cinemaHall;

    @OneToMany(
            mappedBy = "cinemaSeat",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference
    private Set<ShowSeat> ShowSeats;

}
