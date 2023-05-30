package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.Movie;
import com.ap3dominator.bookMyShow.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT user FROM User user")
    List<User> findAllShows();
}
