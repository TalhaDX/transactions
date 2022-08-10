package com.example.transaction.utils;

import com.example.transaction.exceptions.InsufficientAmountException;
import com.example.transaction.exceptions.NoAccountFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountUtilsTest {

    @Test()
    void whenInsufficientAmountThrowException() {
        InsufficientAmountException thrown = Assertions.assertThrows(InsufficientAmountException.class, () -> {
            AccountUtils.validateLimit("User1", 3000.0);
        });

        Assertions.assertEquals("Insufficient amount in account", thrown.getMessage());
    }

    @Test()
    void whenNoAccountFoundThrowException() {
        NoAccountFoundException thrown = Assertions.assertThrows(NoAccountFoundException.class, () -> {
            AccountUtils.validateLimit("User10", 3000.0);
        });

        Assertions.assertEquals("No user account found", thrown.getMessage());
    }
}
