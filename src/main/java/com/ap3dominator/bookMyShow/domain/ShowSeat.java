package com.ap3dominator.bookMyShow.domain;

import com.ap3dominator.bookMyShow.model.Status;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class ShowSeat {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showSeatId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = false)
    private Double price;

    @ManyToOne
    @JsonBackReference(value = "cinemaSeat-showSeat")
    @JoinColumn(name = "cinema_seat_id")
    private CinemaSeat cinemaSeat;

    @ManyToOne
    @JsonBackReference(value = "show-showSeat")
    @JoinColumn(name = "show_id")
    private Show show;

    @ManyToOne
    @JsonBackReference(value = "booking-showSeat")
    @JoinColumn(name = "booking_id")
    private Booking booking;

}
