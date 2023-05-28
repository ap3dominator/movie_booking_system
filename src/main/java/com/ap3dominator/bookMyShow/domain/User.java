package com.ap3dominator.bookMyShow.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class User {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(length = 64)
    private String name;

    @Column(length = 20)
    private String password;

    @Column(length = 64)
    private String email;

    @Column(length = 16)
    private String phone;

    @OneToMany(mappedBy = "user")
    private Set<Booking> userBookings;

}
