package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.CinemaHall;
import com.ap3dominator.bookMyShow.repos.CinemaHallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class CinemaHallController {
    @Autowired
    public CinemaHallRepository cinemaHallRepository;

    @PostMapping("/AddCinemaHall")
    public ResponseEntity<?> AddCinemaHall(@RequestBody CinemaHall cinemaHall)
    {
        CinemaHall addedCinemaHall = cinemaHallRepository.save(cinemaHall);
        return ResponseEntity.ok(addedCinemaHall);
    }
}
