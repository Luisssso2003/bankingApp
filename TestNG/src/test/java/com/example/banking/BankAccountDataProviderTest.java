package com.example.banking;

import org.testng.Assert;
import org.testng.annotations.*;

public class BankAccountDataProviderTest {

    @DataProvider(name = "depositData")
    public Object[][] depositData() {
        return new Object[][] {
            {100.0, 50.0, 150.0},
            {200.0, 0.01, 200.01}
        };
    }

    @Test(dataProvider = "depositData")
    public void testDepositData(double initial, double deposit, double expected) {
        BankAccount account = new BankAccount(initial);
        account.deposit(deposit);
        Assert.assertEquals(account.getBalance(), expected);
    }
}
