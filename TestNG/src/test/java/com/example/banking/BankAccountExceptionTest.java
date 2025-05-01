package com.example.banking;

import org.testng.annotations.Test;

public class BankAccountExceptionTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(-50);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testOverWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(150);
    }
}
