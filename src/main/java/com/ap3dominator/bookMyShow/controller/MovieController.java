package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.Movie;
import com.ap3dominator.bookMyShow.repos.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class MovieController {
    @Autowired
    public MovieRepository movieRepository;

    @PostMapping("/AddMovie")
    public ResponseEntity<?> AddMovie(@RequestBody Movie movie)
    {
        movieRepository.save(movie);
        var isthere = movieRepository.findById(1);

        return ResponseEntity.ok(isthere);
    }

    @GetMapping("/GetAllMovies")
    public ResponseEntity<?> GetAllMovies()
    {
        var AllMovies = movieRepository.findAllMovies();

        return ResponseEntity.ok(AllMovies);
    }
}
