package com.example.transaction.utils;

import com.example.transaction.exceptions.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class AccountUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("User1", 1000.0);
        paymentMap.put("User2", 500.0);
        paymentMap.put("User3", 2000.5);
        paymentMap.put("User4", 10.0);
    }

    public static boolean validateLimit(String userAccount, Double amountPaid){

        if(amountPaid > paymentMap.get(userAccount)){
            throw new InsufficientAmountException("Insufficient amount in account");
        } else {
            return true;
        }
    }
}
