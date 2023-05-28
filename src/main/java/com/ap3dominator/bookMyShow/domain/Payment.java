package com.ap3dominator.bookMyShow.domain;

import com.ap3dominator.bookMyShow.model.PaymentMethod;
import jakarta.persistence.*;

import java.time.OffsetDateTime;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Payment {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private String timestamp;

    @Column
    private String discountCouponId;

    @Column
    private String remoteTransactionId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

}
