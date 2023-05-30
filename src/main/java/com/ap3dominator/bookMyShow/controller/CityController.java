package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.City;
import com.ap3dominator.bookMyShow.repos.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class CityController {
    @Autowired
    public CityRepository cityRepository;

    @PostMapping("/AddCity")
    public ResponseEntity<?> AddCity(@RequestBody City city)
    {
        City savedCity = cityRepository.save(city);
        return ResponseEntity.ok().body(savedCity);
    }

    @GetMapping("/GetAllCities")
    public ResponseEntity<?> GetCity() {
        List<City> allCities = cityRepository.findAll();
        return ResponseEntity.ok().body(allCities);
    }


}
