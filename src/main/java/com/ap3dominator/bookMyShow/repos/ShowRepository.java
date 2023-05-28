package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.Show;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShowRepository extends JpaRepository<Show, Integer> {
}
