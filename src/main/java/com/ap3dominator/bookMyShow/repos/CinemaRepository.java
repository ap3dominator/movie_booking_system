package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.Cinema;
import com.ap3dominator.bookMyShow.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CinemaRepository extends JpaRepository<Cinema, Integer> {


}
