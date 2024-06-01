package com.davidnguyen.factory.methodfactory.bankcard;

import com.davidnguyen.factory.InvalidAmountException;
import com.davidnguyen.factory.Validator;

public abstract class BankCardFactory {
    public abstract BankCard createBankCard();

    public int withdraw(int amount) {
        BankCard bankCard = createBankCard();

        if(Validator.isValidAmount(amount)) {
            return bankCard.withdraw(amount);
        } else {
            throw new InvalidAmountException("Amount is not valid.");
        }
    }

    public int deposit(int amount) {
        BankCard bankCard = createBankCard();

        if(Validator.isValidAmount(amount)) {
            return bankCard.deposit(amount);
        } else {
            throw new InvalidAmountException("Amount is not valid.");
        }
    }
}
