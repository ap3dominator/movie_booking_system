package com.ap3dominator.bookMyShow.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Cinema {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cinemaId;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false)
    private Integer totalCinemaHalls;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "cinema")
    private Set<CinemaHall> cinemaHalls;

}
