package com.example.banking;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAccountGroupTest {

    @Test(groups = "positive-tests")
    public void testPositiveWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(50);
        Assert.assertEquals(account.getBalance(), 50);
    }

    @Test(groups = "negative-tests", expectedExceptions = IllegalArgumentException.class)
    public void testWithdrawTooMuch() {
        BankAccount account = new BankAccount(50);
        account.withdraw(100);
    }
}
