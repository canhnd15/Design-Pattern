package com.davidnguyen.factory.methodfactory.bankcard;

public class CreditCardFactory extends BankCardFactory {
    @Override
    public BankCard createBankCard() {
        return new CreditCard();
    }
}
