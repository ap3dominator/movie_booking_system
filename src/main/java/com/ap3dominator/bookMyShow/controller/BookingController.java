package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.Booking;
import com.ap3dominator.bookMyShow.repos.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BookingController {
    @Autowired
    public BookingRepository bookingRepository;

    @PostMapping("/AddBooking")
    public ResponseEntity<?> AddBooking(@RequestBody Booking booking)
    {
        Booking addedBooking = bookingRepository.save(booking);
        return ResponseEntity.ok(addedBooking);
    }

    @GetMapping("/GetAllBookings")
    public ResponseEntity<?> GetAllBookings()
    {
        var AllBookings = bookingRepository.findAllBookings();
        return ResponseEntity.ok(AllBookings);
    }
}
