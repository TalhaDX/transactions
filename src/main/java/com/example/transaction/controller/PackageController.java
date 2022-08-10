package com.example.transaction.controller;

import com.example.transaction.model.PackageBookingRequest;
import com.example.transaction.model.PackageConfirmation;
import com.example.transaction.service.PackageBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/package")
public class PackageController {

    @Autowired
    private PackageBookingService service;

    @PostMapping
    public PackageConfirmation purchasePackage(@RequestBody PackageBookingRequest request) {
        return service.purchasePackage(request);
    }
}
