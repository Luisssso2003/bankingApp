package com.example.banking;

import org.testng.Assert;
import org.testng.annotations.*;

public class BankAccountDependencyTest {

    BankAccount account;

    @BeforeClass
    public void setup() {
        account = new BankAccount(100);
    }

    @Test
    public void depositFunds() {
        account.deposit(100);
        Assert.assertEquals(account.getBalance(), 200);
    }

    @Test(dependsOnMethods = "depositFunds")
    public void withdrawFunds() {
        account.withdraw(50);
        Assert.assertEquals(account.getBalance(), 150);
    }
}
