package org.example;

import org.junit.jupiter.api.Test;
import tdd.BankAcc;

import static junit.framework.Assert.assertEquals;

public class BankTest {

    @Test
    public void testDeposit(){
        BankAcc account = new BankAcc(100);
        account.deposit(50);
        assertEquals(150, account.getBalance()); //fails initially
    }

@Test
    public void testWithdrawSuccess(){
        BankAcc account = new BankAcc(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance()); //fails initially
    }
}
