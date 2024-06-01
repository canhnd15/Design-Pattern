package com.davidnguyen.factory.abstractfactory.bankcard;

import com.davidnguyen.factory.InvalidAmountException;

public class TechcombankCreditCard implements CreditCard {
    private final Integer WITHDRAW_FEE = 1_000; //fix for sample
    private static Integer BALANCE = 10_000_000; //fix for sample

    @Override
    public int withdraw(int amount) {
        int totalWithdrawAmount = amount + WITHDRAW_FEE;

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
