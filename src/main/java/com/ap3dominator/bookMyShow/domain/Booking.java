package com.ap3dominator.bookMyShow.domain;

import com.ap3dominator.bookMyShow.model.Status;
import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Booking {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @Column(nullable = false)
    private Integer numberOfSeats;

    @Column(nullable = false)
    private String timestamp;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = false)
    private Integer showId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "booking")
    private Set<ShowSeat> bookingShowSeats;

    @OneToMany(mappedBy = "booking")
    private Set<Payment> bookingPayments;

}
