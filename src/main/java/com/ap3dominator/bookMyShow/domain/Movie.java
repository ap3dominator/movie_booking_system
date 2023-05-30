package com.ap3dominator.bookMyShow.domain;

import com.ap3dominator.bookMyShow.model.Genre;
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
public class Movie {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(nullable = false, length = 256)
    private String title;

    @Column(name = "\"description\"", length = 512)
    private String description;

    @Column(nullable = false, length = 16)
    private String duration;

    @Column(nullable = false, length = 16)
    private String language;

    @Column
    private String releaseDate;

    @Column(nullable = false, length = 45)
    private String country;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @OneToMany(
            mappedBy = "movie",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference(value="movie")
    private Set<Show> movieShows;

}
