package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.Payment;
import com.ap3dominator.bookMyShow.domain.Show;
import com.ap3dominator.bookMyShow.repos.PaymentRepository;
import com.ap3dominator.bookMyShow.repos.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PaymentController {
    @Autowired
    public PaymentRepository paymentRepository;

    @PostMapping("/AddPayment")
    public ResponseEntity<?> AddPayment(@RequestBody Payment payment)
    {
        Payment addedPayment = paymentRepository.save(payment);
        return ResponseEntity.ok(addedPayment);
    }

    @GetMapping("/GetAllPayments")
    public ResponseEntity<?> GetAllPayments()
    {
        var AllPayments = paymentRepository.findAllPayments();
        return ResponseEntity.ok(AllPayments);
    }

}
