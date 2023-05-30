package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.Movie;
import com.ap3dominator.bookMyShow.domain.ShowSeat;
import com.ap3dominator.bookMyShow.repos.MovieRepository;
import com.ap3dominator.bookMyShow.repos.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ShowSeatController {
    @Autowired
    public ShowSeatRepository showSeatRepository;

    @PostMapping("/addShowSeat")
    public ResponseEntity<?> AddShowSeat(@RequestBody ShowSeat showSeat)
    {
        ShowSeat addedShowSeat = showSeatRepository.save(showSeat);
        return ResponseEntity.ok(addedShowSeat);
    }
}
