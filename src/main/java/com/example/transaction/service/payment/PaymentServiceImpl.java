package com.example.transaction.service.payment;

import com.example.transaction.domain.PaymentInfo;
import com.example.transaction.repository.PaymentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentInfoRepository repository;

    @Override
    public PaymentInfo getPaymentInfoByUserId(Long userId) {
        return repository.findByUserId(userId);
    }
}
