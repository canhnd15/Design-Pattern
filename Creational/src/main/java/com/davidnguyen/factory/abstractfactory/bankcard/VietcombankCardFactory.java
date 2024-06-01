package com.davidnguyen.factory.abstractfactory.bankcard;

public class VietcombankCardFactory implements BankCardFactory {
    @Override
    public CreditCard createCreditCard() {
        return new VietcombankCreditCard();
    }

    @Override
    public DebitCard createDebitCard() {
        return new VietcombankDebitCard();
    }
}
