package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.CinemaSeat;
import com.ap3dominator.bookMyShow.repos.CinemaSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class CinemaSeatController {
    @Autowired
    public CinemaSeatRepository cinemaSeatRepository;

    @PostMapping("/AddCinemaSeat")
    public ResponseEntity<?> AddCinemaSeat(@RequestBody CinemaSeat cinemaSeat)
    {
        CinemaSeat addedCinemaSeat = cinemaSeatRepository.save(cinemaSeat);
        return ResponseEntity.ok(addedCinemaSeat);
    }

}
