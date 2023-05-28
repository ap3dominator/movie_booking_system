package com.ap3dominator.bookMyShow.domain;

import com.ap3dominator.bookMyShow.model.CinemaSeatType;
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
    private Integer seatNumber;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CinemaSeatType type;

    @Column(nullable = false)
    private Integer cinemaHallId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cinema_seat_id", nullable = false)
    private CinemaHall cinemaSeat;

    @OneToMany(mappedBy = "cinemaSeat")
    private Set<ShowSeat> cinemaSeatShowSeats;

}
