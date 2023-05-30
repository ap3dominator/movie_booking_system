package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.Movie;
import com.ap3dominator.bookMyShow.domain.Show;
import com.ap3dominator.bookMyShow.repos.MovieRepository;
import com.ap3dominator.bookMyShow.repos.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ShowController {
    @Autowired
    public ShowRepository showRepository;

    @PostMapping("/AddShow")
    public ResponseEntity<?> AddShow(@RequestBody Show show)
    {
        Show addedShow = showRepository.save(show);
        return ResponseEntity.ok(addedShow);
    }

    @GetMapping("/GetAllShows")
    public ResponseEntity<?> GetAllShows()
    {
        var AllMovies = showRepository.findAllShows();
        return ResponseEntity.ok(AllMovies);
    }

}
