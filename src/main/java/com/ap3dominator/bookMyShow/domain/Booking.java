package com.ap3dominator.bookMyShow.domain;

import com.ap3dominator.bookMyShow.model.Status;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
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

    @ManyToOne
    @JsonBackReference(value="show")
    @JoinColumn(name = "show_id")
    private Show show;

    @ManyToOne
    @JsonBackReference(value="user")
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(
            mappedBy = "booking",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference
    private Set<Payment> bookingPayments;

    @OneToMany(
            mappedBy = "booking",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference(value = "booking-showSeat")
    private Set<ShowSeat> bookingShowSeats;

}
