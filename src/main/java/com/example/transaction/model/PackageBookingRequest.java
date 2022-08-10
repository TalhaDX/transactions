package com.example.transaction.model;

import com.example.transaction.domain.PaymentInfo;
import com.example.transaction.domain.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PackageBookingRequest {

    private UserInfo userInfo;

    private PaymentInfo paymentInfo;
}
