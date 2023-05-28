package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
