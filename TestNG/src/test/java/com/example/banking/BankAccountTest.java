package com.example.banking;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        Assert.assertEquals(account.getBalance(), 150.0);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(200.0);
        account.withdraw(50.0);
        Assert.assertEquals(account.getBalance(), 150.0);
    }
}
