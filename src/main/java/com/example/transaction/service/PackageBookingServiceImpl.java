package com.example.transaction.service;

import com.example.transaction.domain.PaymentInfo;
import com.example.transaction.domain.PaymentStatus;
import com.example.transaction.domain.UserInfo;
import com.example.transaction.exceptions.InsufficientAmountException;
import com.example.transaction.model.PackageBookingRequest;
import com.example.transaction.model.PackageConfirmation;
import com.example.transaction.repository.PaymentInfoRepository;
import com.example.transaction.repository.UserInfoRepository;
import com.example.transaction.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class PackageBookingServiceImpl implements PackageBookingService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    @Override
    public PackageConfirmation purchasePackage(PackageBookingRequest request) throws InsufficientAmountException {

        UserInfo userInfo = request.getUserInfo();
        userInfoRepository.save(userInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        AccountUtils.validateLimit(paymentInfo.getAccountNo(), userInfo.getFare());

        paymentInfo.setUserId(userInfo.getId());
        paymentInfo.setAmount(userInfo.getFare());

        paymentInfoRepository.save(paymentInfo);

        return new PackageConfirmation(PaymentStatus.SUCCESS, userInfo.getFare(), UUID.randomUUID().toString(), userInfo);
    }
}
