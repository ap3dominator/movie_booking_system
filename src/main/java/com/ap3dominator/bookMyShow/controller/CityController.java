package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.City;
import com.ap3dominator.bookMyShow.repos.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    @DeleteMapping("/DeleteCity/{id}")
    public ResponseEntity<?> deleteCity(@PathVariable Integer id) {
        cityRepository.deleteCity(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", true);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/GetAllCities")
    public ResponseEntity<?> GetCity() {
        List<City> allCities = cityRepository.findAll();
        return ResponseEntity.ok().body(allCities);
    }


}
