package com.example.banking;

import org.testng.annotations.*;
import org.testng.Assert;

public class BankAccountLifecycleTest {

    private static BankAccount sharedAccount;

    @BeforeClass
    public void setup() {
        sharedAccount = new BankAccount(500.0);
    }

    @AfterClass
    public void teardown() {
        sharedAccount = null;
    }

    @Test
    public void testSharedDeposit() {
        sharedAccount.deposit(100.0);
        Assert.assertEquals(sharedAccount.getBalance(), 600.0);
    }
}
