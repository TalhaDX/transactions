package com.example.transaction.controller;

import com.example.transaction.domain.PaymentInfo;
import com.example.transaction.exceptions.NoUserFoundException;
import com.example.transaction.service.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment-info")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{userId}")
    public PaymentInfo getPaymentInfoByUser(@PathVariable Long userId) throws NoUserFoundException {
        return paymentService.getPaymentInfoByUserId(userId);
    }

}
