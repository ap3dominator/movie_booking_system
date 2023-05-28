package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Optional<Movie> findById(Integer integer);

    @Query("SELECT movie FROM Movie movie")
    List<Movie> findAllMovies();



}
