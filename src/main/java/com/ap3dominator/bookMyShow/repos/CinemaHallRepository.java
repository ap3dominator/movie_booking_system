package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.CinemaHall;
import com.ap3dominator.bookMyShow.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CinemaHallRepository extends JpaRepository<CinemaHall, Integer> {

    Optional<CinemaHall> findById(Integer integer);
}
