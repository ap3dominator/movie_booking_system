package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.Booking;
import com.ap3dominator.bookMyShow.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BookingRepository extends JpaRepository<Booking, Integer> {
    @Query("SELECT booking FROM Booking booking")
    List<Booking> findAllBookings();
}
