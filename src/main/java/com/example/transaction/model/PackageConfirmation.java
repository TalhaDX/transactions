package com.example.transaction.model;

import com.example.transaction.domain.PaymentStatus;
import com.example.transaction.domain.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PackageConfirmation {

    private PaymentStatus status;
    private Double totalFare;
    private String packageNo;
    private UserInfo userInfo;
}
