package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
