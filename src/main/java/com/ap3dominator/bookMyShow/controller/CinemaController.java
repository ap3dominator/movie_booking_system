package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.Cinema;
import com.ap3dominator.bookMyShow.repos.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class CinemaController {
    @Autowired
    public CinemaRepository cinemaRepository;

    @PostMapping("/AddCinema")
    public ResponseEntity<?> AddCinema(@RequestBody Cinema cinema)  {
        Cinema addedCinema = cinemaRepository.save(cinema);
        return ResponseEntity.ok().body(addedCinema);
    }

    @GetMapping("/GetAllCinemas")
    public ResponseEntity<List<Cinema>> getAllCinemas() {
        return  ResponseEntity.ok().body(cinemaRepository.findAll());
    }


}
