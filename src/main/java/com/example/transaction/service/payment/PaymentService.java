package com.example.transaction.service.payment;

import com.example.transaction.domain.PaymentInfo;
import com.example.transaction.exceptions.NoUserFoundException;

public interface PaymentService {

    PaymentInfo getPaymentInfoByUserId(Long userId) throws NoUserFoundException;
}
