package com.davidnguyen.factory.abstractfactory.bankcard;

import com.davidnguyen.factory.InvalidAmountException;

public class VietcombankDebitCard implements DebitCard {
    private final Integer MAX_WITHDRAW_PER_TIME = 50_000_000; //fix for sample
    private final Integer MAX_DEPOSIT_PER_TIME = 100_000_000; //fix for sample
    private static Integer BALANCE = 10_000_000; // fix for sample

    @Override
    public int withdraw(int amount) {
        if(BALANCE > amount && amount <= MAX_WITHDRAW_PER_TIME) {
            BALANCE -= amount;
            return BALANCE;
        } else {
            throw new InvalidAmountException("Current balance is not enough or amount is larger than 50.000.000 VND");
        }
    }

    @Override
    public int deposit(int amount) {
        if(amount < MAX_DEPOSIT_PER_TIME) {
            BALANCE += amount;
            return BALANCE;
        } else {
            throw new InvalidAmountException("Deposit amount is larger than 100.000.000 VND");
        }
    }
}
