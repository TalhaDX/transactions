package com.example.transaction.repository;


import com.example.transaction.domain.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

    PaymentInfo findByUserId(Long userId);
}
