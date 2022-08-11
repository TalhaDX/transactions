package com.example.transaction.service.payment;

import com.example.transaction.domain.PaymentInfo;

public interface PaymentService {

    PaymentInfo getPaymentInfoByUserId(Long userId);
}
