package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.Movie;
import com.ap3dominator.bookMyShow.domain.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ShowRepository extends JpaRepository<Show, Integer> {
    @Query("SELECT show FROM Show show")
    List<Show> findAllShows();
}
