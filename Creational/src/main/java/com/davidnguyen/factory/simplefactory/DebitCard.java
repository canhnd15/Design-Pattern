package com.davidnguyen.factory.simplefactory;

import com.davidnguyen.factory.InvalidAmountException;

public class DebitCard implements BankCard {
    private static Integer BALANCE = 10_000_000; // fix for sample

    @Override
    public int withdraw(int amount) {
        if(BALANCE > amount) {
            BALANCE -= amount;
            return BALANCE;
        } else {
            throw new InvalidAmountException("Current balance is not enough.");
        }
    }

    @Override
    public int deposit(int amount) {
        BALANCE += amount;
        return BALANCE;
    }
}
