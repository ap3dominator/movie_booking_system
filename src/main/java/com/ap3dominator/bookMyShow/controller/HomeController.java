package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.Cinema;
import com.ap3dominator.bookMyShow.domain.CinemaHall;
import com.ap3dominator.bookMyShow.domain.City;
import com.ap3dominator.bookMyShow.domain.Movie;
import com.ap3dominator.bookMyShow.repos.CinemaHallRepository;
import com.ap3dominator.bookMyShow.repos.CinemaRepository;
import com.ap3dominator.bookMyShow.repos.CityRepository;
import com.ap3dominator.bookMyShow.repos.MovieRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class HomeController {

    @Autowired
    public MovieRepository movieRepository;

    @Autowired
    public CityRepository cityRepository;

    @Autowired
    public CinemaHallRepository cinemaHallRepository;

    @Autowired
    public CinemaRepository cinemaRepository;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }


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

    @PostMapping("/AddCity")
    public ResponseEntity<?> AddCity(@RequestBody City city)
    {
        City savedCity = cityRepository.save(city);
        return ResponseEntity.ok().body(savedCity);
    }

//    public String convertListToJson(List<City> cityList) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.writeValueAsString(cityList);
//    }

    @GetMapping("/GetAllCities")
    public ResponseEntity<?> GetCity() {
        List<City> allCities = cityRepository.findAll();
//        var jsonResponse = convertListToJson(allCities);
        return ResponseEntity.ok().body(allCities);
    }

    @PostMapping("/AddCinema")
    public ResponseEntity<?> AddCinema(@RequestBody Cinema cinema)  {
        Cinema addedCinema = cinemaRepository.save(cinema);
        return ResponseEntity.ok().body(addedCinema);
    }

    @GetMapping("/GetAllCinemas")
    public ResponseEntity<List<Cinema>> getAllCinemas() {
        return  ResponseEntity.ok().body(cinemaRepository.findAll());
    }

    @PostMapping("/AddCinemaHall")
    public ResponseEntity<?> AddCinemaHall(@RequestBody CinemaHall cinemaHall)
    {
        cinemaHallRepository.save(cinemaHall);
        var isthere = cinemaHallRepository.findById(1);

        return ResponseEntity.ok(isthere);
    }

}
