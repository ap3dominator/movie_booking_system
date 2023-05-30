package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.Movie;
import com.ap3dominator.bookMyShow.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    @Query("SELECT payment FROM Payment payment")
    List<Payment> findAllPayments();
}
