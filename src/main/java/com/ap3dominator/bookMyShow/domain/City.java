package com.ap3dominator.bookMyShow.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@EqualsAndHashCode(exclude = { "cinemas"}) // This,
@ToString(exclude = { "cinemas"}) // and this
public class City {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cityId;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false, length = 64)
    private String state;

    @Column(nullable = false, length = 16)
    private String zipCode;

    @OneToMany(
                mappedBy = "city",
                cascade = CascadeType.ALL,
                fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Cinema> cinemas;

}
