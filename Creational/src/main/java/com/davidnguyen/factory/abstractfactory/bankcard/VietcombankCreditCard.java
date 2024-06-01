package com.davidnguyen.factory.abstractfactory.bankcard;

import com.davidnguyen.factory.InvalidAmountException;

public class VietcombankCreditCard implements CreditCard {
    private final Integer WITHDRAW_FEE = 2_000; //fix for sample
    private static Integer BALANCE = 10_000_000; //fix for sample

    @Override
    public int withdraw(int amount) {
        int totalWithdrawAmount;

        if(amount > 2_000_000) {
            totalWithdrawAmount = amount + WITHDRAW_FEE;
        } else {
            totalWithdrawAmount = amount;
        }

        if(BALANCE > totalWithdrawAmount) {
            BALANCE = BALANCE - totalWithdrawAmount;
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
