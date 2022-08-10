package com.example.transaction.service;

import com.example.transaction.exceptions.InsufficientAmountException;
import com.example.transaction.model.PackageBookingRequest;
import com.example.transaction.model.PackageConfirmation;

public interface PackageBookingService {

    public PackageConfirmation purchasePackage(PackageBookingRequest request) throws InsufficientAmountException;
}
